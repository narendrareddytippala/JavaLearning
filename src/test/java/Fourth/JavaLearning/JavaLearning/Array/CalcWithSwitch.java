package Fourth.JavaLearning.JavaLearning.Array;

import java.util.Scanner;

public class CalcWithSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int first=sc.nextInt();
		int second=sc.nextInt();
		System.out.println("Enter wht +, -, /, *");
		char fun=sc.next().charAt(0);
		int result=0;
		switch(fun){
		case '+': 
				result= first+second;
				break;
		case '-': 
			result= first-second;
			break;
		case '*': 
			result= first*second;
			break;
		case '/': 
			result= first/second;
			break;
		default: 
			System.out.println("Enter valid one");
			break;
		}
		System.out.println(result);
	}

}
