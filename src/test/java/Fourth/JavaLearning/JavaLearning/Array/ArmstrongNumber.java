package Fourth.JavaLearning.JavaLearning.Array;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 370;
		int temp = num;
		int sum =0;
		while(num>0){
			int rev = num%10;
			sum = sum+(rev*rev*rev);
			num=num/10;
		}
		System.out.println(sum);
		if(temp==sum)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not Armstrong");
	}

}
