package Third.JavaLearning.JavaLearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccurrencesOfCharacter_InString {

	public static void main(String[] args) {
		String name = "narendra";
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (char b : name.toCharArray()) {
			mp.put(b, mp.containsKey(b)?mp.get(b)+1:1);
		}
		for (Entry<Character, Integer> en : mp.entrySet()) {
			System.out.println(en.getKey() + " -- " + en.getValue());
		}
	}
}
