package main;


import provider.Bread;
import provider.Factory;

public class Application {

	public static void main(String[] args) {
		
		Factory f1 = new Factory();	
		Factory f2 = new Factory();	
		
		Bread b1 = f1.CreateBread("Chisinau");
		System.out.println(b1);
		
		Bread b2 = f2.CreateBread("Chisinau");
		System.out.println(b2);
		
		Bread b3 = f2.CreateBread("Chisinau");
		System.out.println(b3);
		
		// HW1
		// abstraction
		// naming convention
		// cant create outside factory 
		Bread hacked = new Bread("Chisinau",11111);
		System.out.println(hacked);
		
		Bread b4 = f2.CreateBread("Chisinau");
		System.out.println(b4);
		
		Bread b5 = f1.CreateBread("Chisinau");
		System.out.println(b5);
		
		Bread b6 = f1.CreateBread("Chisinau");
		System.out.println(b6);
		

	}

}
