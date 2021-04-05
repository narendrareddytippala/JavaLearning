package JavaLearning.JavaLearning;

public class Swapnumbers {

	public static void main(String[] args) {
		int a =100;
		int b = 10;
		int temp;
		temp =a;
		a=b;
		b = temp;
		System.out.println(a +"---"+b);
		
		int c =100;
		int d = 10;
		c=c+d;
		d=c-d;
		c=c-d;
		
		System.out.println(c +"---"+d);
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		b= a+b-(a=b);
	}

}
