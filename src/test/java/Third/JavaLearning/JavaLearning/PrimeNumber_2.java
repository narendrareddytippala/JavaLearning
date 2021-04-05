package Third.JavaLearning.JavaLearning;

import java.util.Scanner;

public class PrimeNumber_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		boolean status = true;
//		int k = 0;
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				k++;
//			}
//		}
//		if(k==2){System.out.println("Num is prime");}
		for(int i = 2;i<num;i++){
			if(num%i==0){
				status = false;
			}
		}
		if(status){System.out.println("Prime");}else{System.out.println("Not Prime");}
	}

}
