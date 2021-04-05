package Fifth2.JavaLearning.JavaLearning.Array;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		int num =25;
		double sqrt = num/2;
		double temp;
		do{
			temp = sqrt;
			sqrt = (temp+(num/temp))/2;
		}while(temp-sqrt!=0);
		System.out.println(sqrt);
	}

}
