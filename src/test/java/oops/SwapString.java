package oops;

public class SwapString {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Worlds";
		
		a= a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("A String is: "+a);
		System.out.println("B String is: "+b);

	}

}
