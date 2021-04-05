package JavaLearning.JavaLearning;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = scr.nextInt();
		
		int rev =0;
		while(num!=0){
			rev = rev*10+num%10;
			num = num/10; 
//			System.out.print(rev);
		}
		System.out.println("Number is " +rev);
		
//		StringBuffer sb = new StringBuffer((String.valueOf(num)));
//		System.out.println(sb.reverse());
		
//		StringBuilder sbb = new StringBuilder((String.valueOf(num)));
//		//sbb.append(num);
//		System.out.println(sbb.reverse());
	}

}
