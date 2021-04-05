package Fifth.JavaLearning.JavaLearning.Strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a = "Mother In Law";
		String b = "Hitler Woman";
		char[] aa=a.replace(" ", "").toLowerCase().toCharArray();
		char[] bb=b.replace(" ", "").toLowerCase().toCharArray();
		Arrays.sort(aa);
		Arrays.sort(bb);
		if(Arrays.equals(aa, bb))
			System.out.println("These string are Anagram");
		else
			System.out.println("These string are not Anagram");
	}
}
