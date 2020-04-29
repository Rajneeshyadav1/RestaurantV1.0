package com.example.demo.Mycontroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Restaurant;
import com.example.demo.service.RestaurantService;

@RestController
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String restaurantID, @RequestParam String restaurantName, @RequestParam String restaurantAddress,@RequestParam String restaurantOwner,@RequestParam String restaurantType,@RequestParam String restaurantRating) {
		Restaurant r = restaurantService.create(restaurantID, restaurantName, restaurantAddress,restaurantOwner,restaurantType,restaurantRating);
		return r.toString();
	}
	
	@RequestMapping("/get")
	public Restaurant getRestaurant(@RequestParam String restaurantName) {
		return restaurantService.getByName(restaurantName);
	}
	@RequestMapping("/getAll")
	public List<Restaurant> getAll(){
		return restaurantService.getAll();
	}
	

	@RequestMapping ("/deleteAll")
	public String deleteAll() {
		restaurantService.deleteAll();
		return "Deleted all records";
	}
	
}
