package oops;

public class Armstrong_Number {

	public static void main(String[] args) {
		int num = 153;
		int temp =num;
		int sum = 0;
		while(num>0){
			int rev = num%10;	
			num=num/10;
			sum = sum+(rev*rev*rev);
		}
		System.out.println(sum);
	}
}
