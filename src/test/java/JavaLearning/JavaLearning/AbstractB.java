package JavaLearning.JavaLearning;

public abstract class AbstractB extends AbstractA{
	
	public void engineA(){
		System.out.println("AbstractB -- engineB");
	}
	
	public void engineB(){
		System.out.println("AbstractB -- engineB");
	}
	public void brakeB(){
		System.out.println("AbstractB -- brakeB");
	}
	
	public abstract void color();
}
