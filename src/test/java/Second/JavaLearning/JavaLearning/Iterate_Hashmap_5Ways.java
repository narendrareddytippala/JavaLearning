package Second.JavaLearning.JavaLearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.omg.Messaging.SyncScopeHelper;

public class Iterate_Hashmap_5Ways {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "Mango");
		mp.put(2, "Orange");
		mp.put(3, "Apple");
		mp.put(4, "Banana");
		 bykeyset(mp);
		// byIterator(mp);
		// byentryset(mp);
		// bystream(mp);
		// byforeach(mp);
	}

	private static void byforeach(Map<Integer, String> mp) {
		mp.forEach((key, value) -> {
			System.out.println("Fruit ID " + key + " Fruit name " + value);
		});
	}

	private static void bystream(Map<Integer, String> mp) {
		mp.entrySet().stream()
				.forEach(e -> System.out.println("Fruit ID " + e.getKey() + " Fruit name " + e.getValue()));
	}

	private static void byentryset(Map<Integer, String> mp) {
		for (Entry<Integer, String> en : mp.entrySet()) {
			System.out.println("Fruit ID " + en.getKey());
			System.out.println("Fruit name " + en.getValue());
		}
	}

	private static void byIterator(Map<Integer, String> mp) {
		Iterator<Entry<Integer, String>> iter = mp.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<Integer, String> fin = iter.next();
			System.out.println("Fruit ID " + fin.getKey());
			System.out.println("Fruit name " + fin.getValue());
		}
	}

	private static void bykeyset(Map<Integer, String> mp) {
		for (int a : mp.keySet()) {
			System.out.println("Fruit ID " + a);
			System.out.println("Fruit name " + mp.get(a));
		}
	}
}
