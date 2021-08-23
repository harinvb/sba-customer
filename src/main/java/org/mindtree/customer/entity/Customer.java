package org.mindtree.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


@Entity(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue
	int id;
	

	@NotNull
	@Length(min = 2,max=20,message = "Length has to be in between 2 and 20")
	String name;
	
	@NotNull
	@Length(min = 2,max=20,message = "Length has to be in between 2 and 50")
	String address;
	
	

	public Customer() {
		super();
	}

	public Customer(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
