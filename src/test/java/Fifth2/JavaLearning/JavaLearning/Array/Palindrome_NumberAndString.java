package Fifth2.JavaLearning.JavaLearning.Array;

public class Palindrome_NumberAndString {

	public static void main(String[] args) {
		int num =48484;
		int temp = num;
		int rev=0;
		while(num>0){
		 rev = rev *10+(num%10);
		 num=num/10;
		}
		if(temp==rev)
			System.out.println("Number is Palindrome");
		
		String a= "madam";
		String reva="";
		for(int i=a.length()-1;i>=0;i--){
			reva=reva+a.charAt(i); 
		}
		if(a.equals(reva))
			System.out.println("String is Palindrome");
	}
}
