package Third.JavaLearning.JavaLearning;

import java.util.HashMap;
import java.util.Map;

public class String_Compression_2 {

	public static void main(String[] args) {
		String a = "aabbdef";
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (Character st : a.toCharArray()) {
			mp.put(st, mp.containsKey(st)?mp.get(st)+1:1);
		}
		mp.forEach((k,v)->{System.out.print(k+""+v);});
	}

}
