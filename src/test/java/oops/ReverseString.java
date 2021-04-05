package oops;

public class ReverseString {

	public static void main(String[] args) {
		String a = "selenium";
		for(int i=a.length()-1;i>=0;i--)
		{System.out.print(a.charAt(i));}
		System.out.println("********");
		StringBuffer sb = new StringBuffer(a);
		System.out.print(sb.reverse());
		
	}
}
