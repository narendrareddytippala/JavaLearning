package oops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int i = sc.nextInt();
		boolean state = true;
//		int k = 0;
//		for(int j=2;j<=i;j++){
//			if(i%j==0){
//				k++;
//			}
//		}
//		if(k==2){
//			System.out.println(i+" is Prime number");
//		}
//		else{System.out.println(i+" is not Prime number");}
		
		for(int j=2;j<i;j++){
			if(i%j==0){state = false;}
		}
		System.out.println("Number "+i+" is Prime "+state);
		
	}
}
