package Fifth.JavaLearning.JavaLearning.Array;

public class Palindrome_NumberAndString {

	public static void main(String[] args) {
		// Interger
		int num =48484;
		int temp =num;
		int rev =0;
		while(num>0){
			 rev = rev*10+(num%10);
			 num=num/10;
		}
			if(rev==temp)
				System.out.println(temp +" is Palindrome");
			else
				System.out.println(temp +" is not Palindrome");
			
		//String
			String a = "madam";
			String reva="";
			for(int i=a.length()-1;i>=0;i--){
				reva=reva+a.charAt(i);
			}
			if(reva.contentEquals(a))
				System.out.println(a +" is Palindrome");
			else
				System.out.println(a +" is not Palindrome");
	}
}
