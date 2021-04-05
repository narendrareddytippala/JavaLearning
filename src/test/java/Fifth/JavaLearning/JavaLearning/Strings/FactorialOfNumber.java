package Fifth.JavaLearning.JavaLearning.Strings;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int fact=1;
		for(int i=num;i>0;i--)
			fact=fact*i;
		
		System.out.println(fact);
		
		
		int num1 = 5;
		int fact1=1;
		while(num1>0){
			fact1=fact1*num1;
			num1--;
		}
		System.out.println(fact1);
		
		int num2 = 5;
		int fact2=fact(num2);
		System.out.println(fact2);
	}
	public static int fact(int i){
		if(i!=1){
			return i* fact(i-1);
		}
		return i;
	}
}
