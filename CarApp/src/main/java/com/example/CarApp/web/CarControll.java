package com.example.CarApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.CarApp.domain.Car;
import com.example.CarApp.domain.CarRepository;

@RestController
public class CarControll {
	@Autowired
    private CarRepository repository;

	@RequestMapping("/cars")
    public Iterable<Car> getCars() {
		return repository.findAll();
    } 


}
