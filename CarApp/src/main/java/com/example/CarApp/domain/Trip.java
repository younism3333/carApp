package com.example.CarApp.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int tripId;
    private String name;
    
   @ManyToMany(mappedBy = "trips")
   private Set<Car> cars;
    
    Trip()
    {}

    public Trip(String name) {
        super();
        this.name = name;
    }

    public long getId() {
        return tripId;
    }

    public void setId(int id) {
        this.tripId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}