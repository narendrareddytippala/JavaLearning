package oops;

import java.util.Vector;

public class Inheritance_1_TestMain{

	public static void main(String[] args) {
		Inheritance_1_BMW bmw = new Inheritance_1_BMW(); // Static or compile time poly
		bmw.start();
		bmw.stop();
		bmw.refuel();
		bmw.antithefy();
		bmw.i=20;
		System.out.println(bmw.i);
		bmw.start(9);
		bmw.speed();
		System.out.println(bmw.sound);
		System.out.println(bmw.sound1);
		System.out.println("************");
		
		Inheritance_1_Car car = new Inheritance_1_Car();
		car.start();
		car.stop();
		car.refuel();
		car.start(8);
		car.speed();
		System.out.println(car.sound);
//		System.out.println(car.i=40);
		System.out.println("************");

		Inheritance_1_Car carbmw = new Inheritance_1_BMW(); // Dynamic or runntime poly. child class object is reffered by parent class object reference
		carbmw.start();
		carbmw.stop();
		carbmw.refuel();
		carbmw.start(7);
		carbmw.speed();
		System.out.println(carbmw.sound);
//		System.out.println(carbmw.i=50);
		System.out.println("************");
		
//		Inheritance_1_Car aa = new Inheritance_1_TestMain();
//		aa.start();
//		aa.stop();
//		aa.refuel();
//		aa.speed();
//		aa.gas();
//		System.out.println("************");
//		Inheritance_1_TestMain gg = new Inheritance_1_TestMain();
//		gg.bbaa();
//		gg.start();
//		gg.stop();
		//gg.antithefy();
	}
	
	public void bbaa(){
//		gas();
//		gas();
		
	}
	 
	
	
}
