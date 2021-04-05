package Third.JavaLearning.JavaLearning;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = num; i > 0; i--) {
			fact = i * fact;
		}
		System.out.println(fact);
	}
}
