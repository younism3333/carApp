package com.example.CarApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.CarApp.domain.Car;
import com.example.CarApp.domain.CarRepository;
import com.example.CarApp.domain.Owner;
import com.example.CarApp.domain.ownerrepositrty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


	 @SuppressWarnings("unused")
	@SpringBootApplication
     public class CarAppApplication {
		 @Autowired 
		 private CarRepository repository;
		 
		 @Autowired
		 private ownerrepositrty repository1;
		 
		 
		 
       public static void main(String[] args) {
         SpringApplication.run(CarAppApplication.class, args);
       }

       @Bean
       CommandLineRunner runner(){
         return args -> {
        	 Owner owner1=new Owner("mahmood","younis");
        	 Owner owner2=new Owner("sergie","lavrov");
        	 Owner owner3=new Owner("anas","wael");
        	 
        	 repository1.save(owner1);
        	 repository1.save(owner2);
        	 repository1.save(owner3);
        	 
        	 
        	 
        	 
        	 
        	 repository.save(new Car("Ford", "Mustang", "Red",
                     "ADF-1121", 2017, 59000,owner1));
                    repository.save(new Car("Nissan", "Leaf", "White",
                     "SSJ-3002", 2014, 29000,owner2));    
                     repository.save(new Car("Toyota", "Prius", "Silver",
                     "KKO-0212", 2018, 39000,owner3));
         };
       }
       
     }



