package oops;

class outer{
	static class inner{
		public void display(){
			System.out.println("This is inner class");
		}
	} 
}

public class StaticClassTest {

	public static void main(String[] args) {
			outer.inner obj = new outer.inner();
			obj.display();

	}
}
