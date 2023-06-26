package com.testng.demo.TestNGDemo.groups;

import org.testng.annotations.Test;

public class GroupDemo {
	@Test (groups = { "Car" })	 
	public void Car1() {
		System.out.println("Batch Car - Test car 1");
	}
	
	@Test (groups = { "Car" })
	public void Car2() {
		System.out.println("Batch Car - Test car 2");
	}
	
	@Test (groups = { "Scooter" })
	public void Scooter1() {
		System.out.println("Batch Scooter - Test scooter 1");
	}
	
	@Test (groups = { "Scooter" })
	public void Scooter2() {
		System.out.println("Batch Scooter - Test scooter 2");
	}
	
	@Test (groups = { "Car", "Sedan Car" })
	public void Sedan1() {
		System.out.println("Batch Sedan Car - Test sedan 1");
	}

}
