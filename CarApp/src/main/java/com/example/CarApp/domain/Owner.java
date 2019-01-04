package com.example.CarApp.domain;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Owner {
	@OneToMany(cascade = CascadeType.ALL, mappedBy="owner")
    private List<Car> cars;
    //Getter and setter
    public List<Car> getCars() {
      return cars;
    }

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long ownerid;
  private String firstname, lastname;
public Owner(String firstname, String lastname) {
	super();
	
	this.firstname = firstname;
	this.lastname = lastname;
}
public long getOwnerid() {
	return ownerid;
}

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
 //hhh 
}