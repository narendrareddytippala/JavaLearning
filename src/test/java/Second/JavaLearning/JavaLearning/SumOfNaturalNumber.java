package Second.JavaLearning.JavaLearning;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num= sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
