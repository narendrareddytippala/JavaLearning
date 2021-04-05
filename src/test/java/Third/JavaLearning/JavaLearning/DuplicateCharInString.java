package Third.JavaLearning.JavaLearning;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String a = "aaaaabbcdddee";
		String ser = "a";
		LinkedHashMap<Character, Integer> lh = new LinkedHashMap<>();
		for (char b : a.toCharArray()) {
			lh.put(b, lh.containsKey(b)?lh.get(b)+1:1);
		}
		for(Entry<Character, Integer> en : lh.entrySet()){
			if(en.getKey().toString().equals(ser)){
			System.out.println(en.getKey()+"-"+en.getValue());
			}
		}
	}

}
