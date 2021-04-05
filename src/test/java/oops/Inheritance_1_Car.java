package oops;

public  class Inheritance_1_Car {

	int i=10;
	public String sound = "Low Sound-Car";
	public void start(){
		System.out.println("Car --- Start");
		}
	
	public void start(int i){
		System.out.println("Car --- Start--"+i);
	}
	public void stop(){
		System.out.println("Car --- Stop");
	}
	public void refuel(){
		System.out.println("Car --- Refuel");
	}
	
	public static void speed(){
		System.out.println("Car --- speed");
	}
	
	public void gas(){
		System.out.println("Car --- gas");
	}
}
