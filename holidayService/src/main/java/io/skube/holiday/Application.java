package io.skube.holiday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.skube.holiday.impl.Holiday;
import io.skube.holiday.impl.HolidayRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private HolidayRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		repository.save(new Holiday("Summer", "July holiday in Nisa", "Sunset"));
		repository.save(new Holiday("Citybreak", "Short visit in Praga", "DoubleTree"));
	}
}
