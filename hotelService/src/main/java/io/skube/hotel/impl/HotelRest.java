package io.skube.hotel.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelRest {

	@Autowired
	private HotelRepository repository;

	@RequestMapping("/hotels")
	public List<Hotel> findAll() {
		return repository.findAll();
	}

	@RequestMapping("/hotels/{id}")
	public Hotel findById(@PathVariable("id") String id) {

		Optional<Hotel> hotel = repository.findById(id);
		return hotel.get();
	}
	
	@RequestMapping(value = "/hotels/q", method = RequestMethod.GET)
	public Hotel findByName(@RequestParam("name") String name) {
		return repository.findByName(name);
	}


	@RequestMapping(method = RequestMethod.POST, value = "/hotels")
	public Hotel add(@RequestBody Hotel hotel) {
		return repository.save(hotel);
	}
}