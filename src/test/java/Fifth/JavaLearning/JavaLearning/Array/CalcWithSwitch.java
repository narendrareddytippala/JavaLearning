package Fifth.JavaLearning.JavaLearning.Array;

import java.util.Scanner;

public class CalcWithSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println("Select operator +,-,*,?");
		char ch = sc.next().charAt(0);
		int result=0;
		switch(ch){
		case '+': result =num1 + num2;
		break;
		case '-': result =num1 - num2;
		break;
		case '*': result =num1 * num2;
		break;
		case '/': result =num1 / num2;
		break;
		default: System.out.println("Enter valid operator");
		break;
		}
		System.out.println(result);
	}
}
