package JavaLearning.JavaLearning;

public class InterfaceClass implements InterfaceA,InterfaceB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceA ic = new InterfaceClass();
		ic.savingaccountA();
		ic.currentaccountA();
		//InterfaceClass.currentaccountA();
		ic.interest();
		
		InterfaceB icB = new InterfaceClass();
		icB.savingaccountB();
		icB.currentaccountB();
	  //icB.interest();
		InterfaceB.currentaccountA();
	}

	@Override
	public void savingaccountA() {
		// TODO Auto-generated method stub
		System.out.println("A- savingaccountA");
	}

	public void currentaccountA() {
		// TODO Auto-generated method stub
		System.out.println("A- currentaccount");
	}

	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("AB- interest");

	}

	public void savingaccountB() {
		// TODO Auto-generated method stub
		System.out.println("B- savingaccountB");

	}

	public void currentaccountB() {
		// TODO Auto-generated method stub
		System.out.println("B- currentaccountB");

	}
}
