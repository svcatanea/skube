package io.skube.hotel.impl;

import org.springframework.data.annotation.Id;

public class Hotel {

	@Id
	private String id;

	private String name;
	private String city;
	private int stars;
	private String description;

	public Hotel() {
		super();
	}

	public Hotel(String name, String city, int stars, String description) {
		super();
		this.name = name;
		this.city = city;
		this.stars = stars;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", city=" + city + ", stars=" + stars + ", description="
				+ description + "]";
	}

}
