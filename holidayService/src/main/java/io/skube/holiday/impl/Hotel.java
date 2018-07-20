package io.skube.holiday.impl;

public class Hotel {
	private String name;
	private String city;
	private int stars;
	private String description;

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
		return "Hotel [name=" + name + ", city=" + city + ", stars=" + stars + ", description=" + description + "]";
	}

}
