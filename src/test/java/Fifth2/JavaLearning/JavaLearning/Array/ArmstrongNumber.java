package Fifth2.JavaLearning.JavaLearning.Array;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int mul=0;
		while(num>0){
			int rev = num%10;
			mul=mul+(rev*rev*rev);
			num=num/10;
		}
			if(temp==mul)
				System.out.println("Number is ArmStrong");
			else
				System.out.println("Number is not ArmStrong");
	}
}
