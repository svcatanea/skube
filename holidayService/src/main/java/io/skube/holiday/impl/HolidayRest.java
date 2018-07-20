package io.skube.holiday.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class HolidayRest {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${hotelService:http://localhost:6100/hotels/q}")
	private String hotelService;

	@Autowired
	private HolidayRepository repository;

	@RequestMapping("/holidays")
	public List<Holiday> findAll() {
		return repository.findAll();
	}

	@RequestMapping(value = "/holidays/q", method = RequestMethod.GET)
	public Holiday findByName(@RequestParam("name") String name) {
		
		Holiday holiday = repository.findByName(name);
		holiday.setHotel(getHotel(holiday.getHotelName()));
		return holiday;
	}

	@RequestMapping("/holidays/{id}")
	public Holiday findById(@PathVariable("id") String id) {

		Holiday holiday = repository.findById(id).get();
		holiday.setHotel(getHotel(holiday.getHotelName()));
		return holiday;
	}

	private Hotel getHotel(String hotelName) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(hotelService)
			    .queryParam("name", hotelName);
		ResponseEntity<Hotel> response = restTemplate.getForEntity(builder.toUriString(), Hotel.class);
		return response.getBody();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/holidays")
	public Holiday add(@RequestBody Holiday holiday) {
		return repository.save(holiday);
	}
}