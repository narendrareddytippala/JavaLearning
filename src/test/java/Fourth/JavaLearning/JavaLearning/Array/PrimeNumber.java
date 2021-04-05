package Fourth.JavaLearning.JavaLearning.Array;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		boolean status = true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				status = false;
			}
		}
		if(status)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");
	}
}
