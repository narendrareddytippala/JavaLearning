package Second.JavaLearning.JavaLearning;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scr1 = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = scr1.nextInt();
// Method 1
//		int rev = 0;
//		while(num>0){
//			rev = rev*10+ (num%10);
//			num=num/10;
//		}
//		System.out.println(rev);
// Method 2
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		System.out.println(sb.reverse());
		
// Method 3
		StringBuilder sb1 = new StringBuilder(String.valueOf(num));
		System.out.println(sb1.reverse());
	}
}
