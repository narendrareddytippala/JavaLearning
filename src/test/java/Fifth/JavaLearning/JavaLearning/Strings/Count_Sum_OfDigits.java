package Fifth.JavaLearning.JavaLearning.Strings;

public class Count_Sum_OfDigits {

	public static void main(String[] args) {
		int num =12345;
		int sum=0;
		while(num>0){
			int rev = num%10;
			sum=sum+rev;
			num=num/10;
		}
		System.out.println(sum);
	}

}
