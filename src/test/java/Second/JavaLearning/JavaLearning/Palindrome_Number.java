package Second.JavaLearning.JavaLearning;

public class Palindrome_Number {

	public static void main(String[] args) {
	    int num=1111;
	    int org = num;
		int rev=0;
		while(num>0){
			rev = rev*10+(num%10);
			num=num/10;
		}
		if(org==rev){
			System.out.println("Num is Palindrome");
		}
		else{System.out.println("Num is not Palindrome");}
	}

}
