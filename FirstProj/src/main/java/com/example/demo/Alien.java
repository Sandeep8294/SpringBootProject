package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Alien {
	public int id;
	public String aname;
	public String tect;
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;

	
	
	public Alien() {
		super();
		System.out.println("Object created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getTect() {
		return tect;
	}

	public void setTect(String tect) {
		this.tect = tect;
	}
	public void show() {
		System.out.println("Aliens Show");
		laptop.compile();
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	

	
}
