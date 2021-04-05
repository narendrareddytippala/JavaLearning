package Third.JavaLearning.JavaLearning;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		int num =5;
		double temp;
		double sr = num/2;
		do{
			temp = sr;
			sr = (temp+(num/temp))/2;
		}while(temp-sr!=0);
		System.out.println(sr);
	}

}
