package oops;

public class ConstrutorB {
	
	public ConstrutorB(){
		System.out.println("Empty");
		}
	
	public ConstrutorB(int i){
	System.out.println(i);
	}
	public ConstrutorB(int i, int j){
		System.out.println(i+"--"+j);
		}
	
	public static void main(String[] args) {
		ConstrutorB b= new ConstrutorB(1);
		ConstrutorB b1= new ConstrutorB(1,2);
		ConstrutorB b2= new ConstrutorB();
	}
}
