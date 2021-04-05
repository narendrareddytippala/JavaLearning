package Third.JavaLearning.JavaLearning;

public class Palindrome_Number {

	public static void main(String[] args) {
		int num = 1221;int rev =0; int temp = num;
		
		while(num>0){
			rev = rev*10+(num%10);
			num=num/10;
		}
		if(temp==rev){
		System.out.println("Palindrome_Number");
		}else {System.out.println("Not Palindrome_Number");}
	}

}
