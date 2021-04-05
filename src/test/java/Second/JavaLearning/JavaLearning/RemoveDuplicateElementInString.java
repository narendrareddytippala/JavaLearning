package Second.JavaLearning.JavaLearning;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementInString {

	public static void main(String[] args) {
		String a = "narendra";
		Set<Character> se = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length(); i++) {
			if (!se.contains(a.charAt(i))) {
				se.add(a.charAt(i));
				sb.append(a.charAt(i));
			}
		}
		System.out.println(sb);
		
		Set<Character> se1 = new HashSet<Character>();
		for(char b:a.toCharArray()){
			if(se1.add(b)==true){
				System.out.print(b);
			}
		}
	}
}
