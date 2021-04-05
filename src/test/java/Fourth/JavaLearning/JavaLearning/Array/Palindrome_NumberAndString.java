package Fourth.JavaLearning.JavaLearning.Array;

public class Palindrome_NumberAndString {

	public static void main(String[] args) {
		int num =48484;
		int temp = num;
		int rev =0;
		while(num>0){
			rev = rev*10+(num%10);
			num=num/10;
		}
		System.out.println(rev);
		if(rev==temp)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
		
		
		
		String name = "madam";
		String rev1="";
		for(int i=name.length()-1;i>=0;i--){
			rev1=rev1+name.charAt(i);
		}
		System.out.println(rev1);
		if(name.equals(rev1))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}
}
