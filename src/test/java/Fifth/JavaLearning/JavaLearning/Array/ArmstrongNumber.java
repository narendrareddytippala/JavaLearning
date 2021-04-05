package Fifth.JavaLearning.JavaLearning.Array;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int asm = 0;
		while(num>0){
			int rev = num%10;
			asm=(int)(asm+(Math.pow(rev, 3)));
			num=num/10;
		}
		if(asm==temp)
			System.out.println("Number is ArmstrongNumber");
		else
			System.out.println("Number is not ArmstrongNumber");
	}
}
