package Third.JavaLearning.JavaLearning;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		int a[] = {4,5,5,5,4,6,6,9,4};
		LinkedHashMap<Integer, Integer> lh = new LinkedHashMap<>();
		for (int i : a) {
			lh.put(i, lh.containsKey(i)?lh.get(i)+1:1);
		}
			for (Entry<Integer,Integer> en: lh.entrySet() ) {
				System.out.println(en.getKey()+"--"+en.getValue());
			}
		
	}
}
