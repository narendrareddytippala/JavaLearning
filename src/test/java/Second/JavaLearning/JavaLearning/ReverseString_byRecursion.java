package Second.JavaLearning.JavaLearning;

public class ReverseString_byRecursion {

	public static void main(String[] args) {
		String a = "narendra";
		System.out.println(reverse(a));
	}

	private static String reverse(String a) {
		if(a==null || a.length()<=1)
		{
			return a;
		}
		return reverse(a.substring(1))+a.charAt(0);
	}
}
