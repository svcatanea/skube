package io.skube.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.skube.hotel.impl.Hotel;
import io.skube.hotel.impl.HotelRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private HotelRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		repository.save(new Hotel("Sunset", "Nisa", 4, "Quiet hotel with sea side view"));
		repository.save(new Hotel("DoubleTree", "Praga", 3, "Near by center"));
	}
}
