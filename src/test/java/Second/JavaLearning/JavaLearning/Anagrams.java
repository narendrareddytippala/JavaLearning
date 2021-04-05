package Second.JavaLearning.JavaLearning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {
	static boolean status = false;
	public static void main(String[] args) {
		String a = "Mother In Law";
		String b = "Hitler Woman";
		char[] aa = a.replace(" ", "").toLowerCase().toCharArray();
		char[] bb = b.replace(" ", "").toLowerCase().toCharArray();
		Arrays.sort(aa);
		Arrays.sort(bb);
		status = Arrays.equals(aa, bb);
		System.out.println(status);
	}
	
}
