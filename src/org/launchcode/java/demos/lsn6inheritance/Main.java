package org.launchcode.java.demos.lsn6inheritance;


import java.sql.SQLOutput;

public class Main {
	public static void main(String[] args) {

//		HouseCat  garfield = new HouseCat("Garfield", 12);
//		garfield.eat();
//		System.out.println(garfield.isTired());

//		HouseCat spike = new HouseCat("Spike");
//		System.out.println(spike.getWeight());

		Cat plainCat = new Cat(8.6);
		HouseCat cheshireCat = new HouseCat("Cheshire", 12);

		System.out.println(plainCat.noise());
		System.out.println(cheshireCat.noise());
	}

}