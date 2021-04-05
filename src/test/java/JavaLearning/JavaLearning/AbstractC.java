package JavaLearning.JavaLearning;

public class AbstractC extends AbstractA{

	public void engineA(){
		System.out.println("AbstractC -- engineA");
	}
	
	@Override
	public void color() {
		System.out.println("AbstractC --- Color");
		
	}

}
