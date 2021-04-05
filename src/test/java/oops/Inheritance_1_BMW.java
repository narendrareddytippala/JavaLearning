package oops;

public class Inheritance_1_BMW extends Inheritance_1_Car{
	public String sound = "High Sound-BMW";
	public String sound1 = super.sound;
//	public int i=20;
	public void start(){
		System.out.println("BMW --- Start");
	}
	public void antithefy(){
		System.out.println("BMW --- antithefy");
		
	}
	public static void speed(){
		System.out.println("BMW --- Speed");
	}
	
	public void gas(){
		System.out.println("BMW --- gas1");
	}
}
