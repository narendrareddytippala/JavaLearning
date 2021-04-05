package Fourth.JavaLearning.JavaLearning.Array;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class FindFrequenctOfNumInArray {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 1, 5, 7, 9, 5 };
		LinkedHashMap<Integer, Integer> lh = new LinkedHashMap<>();
		for (int b : a) {
			lh.put(b, lh.containsKey(b) ? lh.get(b) + 1 : 1);
		}
		for (Entry<Integer, Integer> en : lh.entrySet()) {
			System.out.println(en.getKey() + "--" + en.getValue());
		}
	}
}
