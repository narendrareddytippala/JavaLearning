package Second.JavaLearning.JavaLearning;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0 1  1 2 3 5 8 13
		int n1=0;
		int n2 =1;
		int temp=0;
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<=10;i++){
			temp = n1 + n2;
			n1 = n2;
			n2 = temp;	
			System.out.print(temp+" ");
		}
		System.out.println("");
	
		int m1=0; int m2=1; int fib= 0;
		for(int j=1;j<12;j++){
			System.out.print(m1+" ");
			fib = m1+m2;
			m1=m2;
			m2=fib;
		}
	}

}
