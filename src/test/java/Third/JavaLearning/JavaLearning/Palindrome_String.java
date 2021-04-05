package Third.JavaLearning.JavaLearning;

public class Palindrome_String {

	public static void main(String[] args) {
		String name = "madam";String rev = "";
		for(int i = name.length()-1;i>=0;i--){
			rev = rev+name.charAt(i); 
		}
		if(name.equals(rev)){System.out.println("Its Palindrome String");}
		else{
			System.out.println("Its not Palindrome String");}
	}
}
