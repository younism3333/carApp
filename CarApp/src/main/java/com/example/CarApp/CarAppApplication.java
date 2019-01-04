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
import com.example.CarApp.domain.trip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


	 @SpringBootApplication
     public class CarAppApplication {
		 @Autowired 
		 private CarRepository repository;
		 
		 @Autowired
		 private ownerrepositrty repository1;
		 
		 @Autowired
		 private trip repository2;
		 
       public static void main(String[] args) {
         SpringApplication.run(CarAppApplication.class, args);
       }

       @Bean
       CommandLineRunner runner(){
         return args -> {
        	 Owner owner1=new Owner("mmm","jj");
        	 Owner owner2=new Owner("nn","iii");
        	 Owner owner3=new Owner("pp","ff");
        	 
        	 repository1.save(owner1);
        	 repository1.save(owner2);
        	 repository1.save(owner3);
        	 
        	 
        	 trip trip1=new trip("Tel Aviv", owner1,"Ford" );
        	 
        	 
        	 repository.save(new Car("Ford", "Mustang", "Red",
                     "ADF-1121", 2017, 59000,owner1));
                    repository.save(new Car("Nissan", "Leaf", "White",
                     "SSJ-3002", 2014, 29000,owner2));    
                     repository.save(new Car("Toyota", "Prius", "Silver",
                     "KKO-0212", 2018, 39000,owner3));
                     repository1.save(new Owner("mahmood","younis"));
                     repository1.save(new Owner("sergie","lavrov"));
                     repository1.save(new Owner("tamar","koenig"));
         };
       }
       
     }



