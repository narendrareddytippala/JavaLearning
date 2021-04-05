package Fifth2.JavaLearning.JavaLearning.Array;

import java.util.Scanner;

public class CalcWithSwitch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int fir = sc.nextInt();
		System.out.println("Enter second number");
		int sec = sc.nextInt();
		System.out.println("Enter opertator +, -, *, /");
		char opt = sc.next().charAt(0);
		int result =0;
		switch(opt){
		case '+': result= fir+sec;
		break;
		case '-': result= fir-sec;
		break;
		case '*': result= fir*sec;
		break;
		case '/': result= fir/sec;
		break;
		default: System.out.println("Enter valid operator");
		break;
		}
		System.out.println(result);
	}

}
