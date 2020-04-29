package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Restaurant;
import com.example.demo.repository.RestaurantRepository;

@Service
public class RestaurantService {
   
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	//Create operation
	public Restaurant create(String restaurantID,String restaurantName,String restaurantAddress,String restaurantOwner,String restaurantType,String restaurantRating) {
		return restaurantRepository.save(new Restaurant(restaurantID,restaurantName, restaurantAddress, restaurantOwner,restaurantType,restaurantRating));
	}
	//Get By Name
	public Restaurant getByName(String restaurantName) {
		return restaurantRepository.findByRestaurantName(restaurantName);
	}
	//Retrieve operation
	public List<Restaurant> getAll(){
		return restaurantRepository.findAll();
	}
	

	//Delete operation
	public void deleteAll() {
		restaurantRepository.deleteAll();
	}
	
}
