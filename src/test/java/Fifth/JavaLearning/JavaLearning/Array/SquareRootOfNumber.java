package Fifth.JavaLearning.JavaLearning.Array;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		int num =25;
		double sr = num/2;
		double temp;
		do{
			temp = sr;
			sr=(temp+(num/temp))/2;
		}while(temp-sr!=0);
		System.out.println(temp);
	}

}
