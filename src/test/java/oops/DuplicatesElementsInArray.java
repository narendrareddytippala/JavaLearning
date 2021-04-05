package oops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class DuplicatesElementsInArray {

	public static void main(String[] args) {
		String[] a = { "java", "net", "java", "net", "python", "cobol" };
		HashMap<String, Integer> hm = new LinkedHashMap<>();
		for (String b : a) {
			hm.put(b, hm.containsKey(b) ? hm.get(b) + 1 : 1);
		}
		hm.forEach((k, v) -> {
			System.out.println(k + "--" + v);
		});
		System.out.println("*****************");
		//////////////
		Set<String> st = new HashSet<>();
		for (String b : a) {
			if (!(st.contains(b))) {
				st.add(b);
				System.out.println(b);
			}
		}
		System.out.println("*****************");
		//////////////
		Set<String> st1 = new HashSet<>();
		for (String b : a) {
			if (st1.add(b) == true) {
				System.out.println(b);
			}
		}
	}
}
