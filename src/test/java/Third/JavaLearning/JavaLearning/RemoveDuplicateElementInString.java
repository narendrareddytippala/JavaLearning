package Third.JavaLearning.JavaLearning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementInString {

	public static void main(String[] args) {
		String a = "narendra";
		Set<Character> st = new HashSet<>();
		for(char ch : a.toCharArray()){
			if(!st.contains(ch)){
				System.out.print(ch);
				st.add(ch);
			}
		}
	}
}
