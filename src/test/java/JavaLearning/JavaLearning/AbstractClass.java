package JavaLearning.JavaLearning;

public class AbstractClass{

	public static void main(String[] args) {
		AbstractC aa = new AbstractC();
		aa.brakeA();
		aa.color();
		aa.engineA();
		
//		AbstractA ff = new AbstractA();
//		ff.brakeA();
//		ff.color();
//		ff.engineA();
		
		
		AbstractA cc = new AbstractC();
		cc.brakeA();
		cc.color();
		cc.engineA();
}

	public void engineA(){
		System.out.println("AbstractClass -- engineA");
	}
	
	public void color() {
		System.out.println("AbstractClass --- Color");
		
	}
}
//AbstractA -- brakeA
//AbstractC --- Color
//AbstractC -- engineA
//AbstractA -- brakeA
//AbstractClass --- Color
//AbstractClass -- engineA
//AbstractA -- brakeA
//AbstractClass --- Color
//AbstractClass -- engineA

