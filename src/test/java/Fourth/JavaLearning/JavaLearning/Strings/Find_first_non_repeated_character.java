package Fourth.JavaLearning.JavaLearning.Strings;

import java.util.LinkedHashMap;

public class Find_first_non_repeated_character {
	static int count =0;
	public static void main(String[] args) {
		String a = "aabbdef";
		LinkedHashMap<Character, Integer> lh = new LinkedHashMap<>();
		for(char b : a.toCharArray()){
			lh.put(b, lh.containsKey(b)?lh.get(b)+1:1);
		}
		lh.forEach((k,v)->{
			if(v==1){
				count++;
				if(count ==1){
					System.out.println(k+"--"+v);
				}
			}
			
		});
	}
}
