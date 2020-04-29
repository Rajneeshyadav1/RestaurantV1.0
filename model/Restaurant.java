package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Restaurant {
	@Id
	private String restaurantId;
	private String restaurantName;
	private String restaurantAddress;
    private String restaurantOwner;
    private String restaurantType;
    private String restaurantRating;
	public Restaurant(String restaurantId, String restaurantName, String restaurantAddress, String restaurantOwner,
			String restaurantType, String restaurantRating) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.restaurantOwner = restaurantOwner;
		this.restaurantType = restaurantType;
		this.restaurantRating = restaurantRating;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public String getRestaurantOwner() {
		return restaurantOwner;
	}
	public void setRestaurantOwner(String restaurantOwner) {
		this.restaurantOwner = restaurantOwner;
	}
	public String getRestaurantType() {
		return restaurantType;
	}
	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}
	public String getRestaurantRating() {
		return restaurantRating;
	}
	public void setRestaurantRating(String restaurantRating) {
		this.restaurantRating = restaurantRating;
	}
    
    

}
