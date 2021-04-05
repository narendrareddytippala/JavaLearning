package oops;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashtableTest {

	public static void main(String[] args) {
		HashMap h = new LinkedHashMap<>();
		h.put("1", "One");
		h.put("2", "Two");
		h.put(3, "One");
		h.put(4, 4);
		h.put("2", "Twooo");
		h.put("A", 1);
		h.put("B", 1);
		//h.put("A", 2);
		System.out.println(h);
		System.out.println(h.get("2"));
		System.out.println(h.get("A"));
	}
}
