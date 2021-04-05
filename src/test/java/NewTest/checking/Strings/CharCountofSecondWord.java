package NewTest.checking.Strings;

import java.util.Scanner;

public class CharCountofSecondWord {

	public static void main(String[] args) {
		String name = "The best of both worlds";
		String spl[] = name.split(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
//		for(int i =0;i<=spl.length;i++){
//			if(i==num){
//			System.out.println(spl[num-1].length());
//			System.out.println(spl[num-1]);
//			}
//		}
		
		int count=0;
		for(int i=0;i<spl[num-1].length();i++){
			count++;
		}
		System.out.println(count);
	}
}
