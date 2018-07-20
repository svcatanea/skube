package io.skube.holiday.impl;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

public class Holiday {

	@Id
	private String id;

	private String name;
	private String description;

	private String hotelName;

	@Transient
	private Hotel hotel;

	public Holiday() {
		super();
	}

	public Holiday(String name, String description, String hotelName) {
		super();
		this.name = name;
		this.description = description;
		this.hotelName = hotelName;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Holiday [id=" + id + ", name=" + name + ", description=" + description + ", hotelName=" + hotelName
				+ ", hotel=" + hotel + "]";
	}

}
