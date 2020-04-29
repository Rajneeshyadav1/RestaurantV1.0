package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Restaurant;



@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String>{
   public Restaurant findByRestaurantName(String RestaurantName);

   
}
