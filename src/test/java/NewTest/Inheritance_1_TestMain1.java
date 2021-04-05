package NewTest;

public class Inheritance_1_TestMain1 extends Inheritance_1_Car1{
	public String sound = "High Sound-BMW";
	public String sound1 = super.sound;
	public static void main(String[] args) {
		
		Inheritance_1_TestMain1 bmw = new Inheritance_1_TestMain1(); // Static or compile time poly
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
		
		Inheritance_1_Car1 car = new Inheritance_1_Car1();
		car.start();
		car.stop();
		car.refuel();
		car.start(8);
		car.speed();
		System.out.println(car.sound);
		System.out.println("************");
		
		Inheritance_1_Car1 carbmw = new Inheritance_1_BMW1(); // Dynamic or runntime poly. child class object is reffered by parent class object reference
		carbmw.start();
		carbmw.stop();
		carbmw.refuel();
		carbmw.start(7);
		carbmw.speed();
		System.out.println(carbmw.sound);
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
