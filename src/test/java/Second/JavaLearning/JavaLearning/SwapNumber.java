package Second.JavaLearning.JavaLearning;

public class SwapNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int temp;
		System.out.println("Before Swap "+a+"----"+b);
	//Method 1:
//		temp = b;
//		b = a;
//		a= temp;
	//Method 2:
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
	//Method 3:
//		a=a^b;
//		b=a^b;
//		a=a^b;
		
	//Method 4, a,b should not have 0:
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
	//Method 5:
		b = a+b-(a=b);
		System.out.println("After Swap "+a+"----"+b);

	}

}
