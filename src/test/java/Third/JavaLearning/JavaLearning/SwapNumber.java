package Third.JavaLearning.JavaLearning;

public class SwapNumber {

	public static void main(String[] aa) {
		int a = 1; int b =2;
//		System.out.println("Before " +a+"-"+b);
//		int temp = a;
//		a=b;
//		b=temp;
//		System.out.println("After " +a+"-"+b);
//		System.out.println("-----------------");
//		System.out.println("Before " +a+"-"+b);
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After " +a+"-"+b);
//		System.out.println("-----------------");
//		System.out.println("Before " +a+"-"+b);
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("After " +a+"-"+b);
//		System.out.println("-----------------");
//		System.out.println("Before " +a+"-"+b);
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		System.out.println("After " +a+"-"+b);
//		System.out.println("-----------------");
		System.out.println("Before " +a+"-"+b);
		b=a+b-(a=b);
		System.out.println("After " +a+"-"+b);
	}
}
