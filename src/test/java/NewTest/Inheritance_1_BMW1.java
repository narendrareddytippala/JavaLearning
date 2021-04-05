package NewTest;

public class Inheritance_1_BMW1 extends Inheritance_1_Car1{
	public String sound = "High Sound-BMW";
	public String sound1 = super.sound;
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
