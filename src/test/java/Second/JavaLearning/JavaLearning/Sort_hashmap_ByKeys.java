package Second.JavaLearning.JavaLearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Sort_hashmap_ByKeys {

	public static void main(String[] args) {
		Map<String, String> mpus= new HashMap<String, String>();
		mpus.put("bana", "bana");
		mpus.put("zee", "zee");
		mpus.put("apple", "apple");
		mpus.put("ghee", "ghee");
		mpus.put("ice", "ice");
//		for (Entry<String, String> en : mpus.entrySet()) {
//			System.out.println(en.getKey());
//		}
		System.out.println("");
		Map<String, String> mps = new TreeMap<>(mpus);
		for (Entry<String, String> en : mps.entrySet()) {
			System.out.println(en.getKey());
		}
	}

}
