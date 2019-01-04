package com.example.CarApp.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class trip {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private long tripid;
	private Owner Owner;
	private String Car;
	  public String getTripName() {
		return tripName;
	}
	public void setTripName(String tripName) {
		this.tripName = tripName;
	}
	public trip(String tripName, Owner owner, String car) {
		super();
		this.tripName = tripName;
		this.Owner = owner;
		this.Car=car;
	}
	private String tripName;
}
