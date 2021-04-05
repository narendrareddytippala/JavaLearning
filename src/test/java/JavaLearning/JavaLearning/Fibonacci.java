package JavaLearning.JavaLearning;

public class Fibonacci {

	public static void main(String[] args) {
		// 0 1  1 2 3 5 8 13
		int n1 =0; int n2 = 1; //int sum =0;
		//System.out.println(n1+"--"+n2);
		for(int i =0; i<=10;i++){
			System.out.print(n1);
			int sum = n1 + n2;
			n1=n2;
			n2=sum;
		}
	}
}
