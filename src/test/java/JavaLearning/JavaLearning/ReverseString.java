package JavaLearning.JavaLearning;

public class ReverseString {

	public static void main(String[] args) {
		String name = "madam";
		String dum = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			// System.out.print(name.charAt(i));
			dum = dum + name.charAt(i);
		}
		if (name.equals(dum))
			System.out.println("This is Palindrome");
		else
			System.out.println("This is not Palindrome");
	}
}
