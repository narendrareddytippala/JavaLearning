package Fourth.JavaLearning.JavaLearning.Strings;

import java.util.LinkedHashMap;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String a = "aaaaabbcdddee";
		char find = 'b';
		LinkedHashMap<Character, Integer> lh = new LinkedHashMap<>();
		for(char b : a.toCharArray()){
			lh.put(b, lh.containsKey(b)?lh.get(b)+1:1);
		}
		lh.forEach((k,v)->{
			if(k.equals(find)){
				System.out.println(k+"--"+v);
			}
		});
	}

}
