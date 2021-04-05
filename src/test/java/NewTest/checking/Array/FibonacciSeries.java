package NewTest.checking.Array;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();
		int n1=0; int n2=1;
		for(int i =0 ;i< num;i++){
			System.out.print(n1+" ");
			int temp = n1+n2;
			n1=n2;
			n2=temp;
		}
	}

}
