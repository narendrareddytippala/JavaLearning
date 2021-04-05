package Third.JavaLearning.JavaLearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Find_first_non_repeated_character {

	public static void main(String[] args) {
		String a = "aabbdef";
		int num = 0;
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (char b : a.toCharArray()) {
			mp.put(b, mp.containsKey(b) ? mp.get(b) + 1 : 1);
		}
		for (Entry<Character, Integer> en : mp.entrySet()) {
			if (en.getValue() == 1) {
				num++;
				if (num == 1) {
					System.out.println(en.getKey() + "--" + en.getValue());
				}
			}
		}
	}
}
