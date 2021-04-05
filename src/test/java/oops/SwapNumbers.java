package oops;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
//		int temp = a;
//		a=b;
//		b=temp;
//		System.out.println("A is:"+a);
//		System.out.println("B is:"+b);
		//////////
//		a=a+b;
//		b=a-b;
//		a=a-b;
		//////////
//		a=a*b;
//		b=a/b;
//		a=a/b;
		//////////
//		a=a^b;
//		b=a^b;
//		a=a^b;
		//////////
		b=(a+b)-(a=b);
		
		System.out.println("A is:"+a);
		System.out.println("B is:"+b);
	}

}
