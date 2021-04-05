package oops;

public class Palindrome_Number {

	public static void main(String[] args) {
		int num = 121;
		int temp = num;
//		System.out.println(num%10);
//		System.out.println(num/10);
		int rev = 0;
		while (num>0){
			rev = rev*10+num%10;
			num = num/10;
		}
		if(temp==rev){System.out.println("Its Palindrome Number");}
		else {System.out.println("Its not Palindrome Number");}
	}

}
