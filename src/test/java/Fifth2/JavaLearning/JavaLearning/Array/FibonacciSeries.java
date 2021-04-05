package Fifth2.JavaLearning.JavaLearning.Array;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 =0,  n2=1;
		for(int i=0;i<10;i++){
			System.out.println(n1);
			int temp = n1+n2;
			n1=n2;
			n2=temp;
		}
	}
}
