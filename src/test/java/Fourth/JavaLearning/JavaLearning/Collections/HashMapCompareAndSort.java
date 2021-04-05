package Fourth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashMapCompareAndSort {

	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "A");
		hm1.put(2, "B");
		hm1.put(3, "C");

		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(1, "A");
		hm2.put(2, "B");
		hm2.put(3, "C");

		
		HashMap<Integer, String> hm3 = new HashMap<>();
		hm3.put(1, "A");
		hm3.put(2, "B");
		hm3.put(3, "C");
		hm3.put(3, "D");
		
		//On base of Key use key. Here k+v should be same then only its true
		System.out.println(hm1.equals(hm2));// true
		System.out.println(hm1.equals(hm3));// false
		
		// Only key compare
		System.out.println(hm1.keySet().equals(hm2.keySet()));// true
		System.out.println(hm1.keySet().equals(hm3.keySet()));// true
		
		
		
		// Find extra key by using set
		HashMap<Integer, String> hm4 = new HashMap<>();
		hm4.put(1, "A");
		hm4.put(2, "B");
		hm4.put(3, "C");
		hm4.put(4, "D");
		HashSet<Integer> hs = new HashSet<>(hm1.keySet());
		hs.addAll(hm4.keySet());
		//hs.removeAll(hm1.keySet());
		hs.retainAll(hm1.keySet());
		System.out.println(hs);
		
		// Compare by Values
		HashMap<Integer, String> hm5 = new HashMap<>();
		hm5.put(1, "A");
		hm5.put(2, "B");
		hm5.put(3, "C");
		hm5.put(4, "C");
		
		
		System.out.println(new ArrayList<>(hm1.values()).equals(new ArrayList<>(hm2.values()))); // true
		System.out.println(new ArrayList<>(hm1.values()).equals(new ArrayList<>(hm3.values())));// false
		System.out.println(new ArrayList<>(hm1.values()).equals(new ArrayList<>(hm5.values())));// false
		
		System.out.println(new HashSet<>(hm1.values()).equals(new HashSet<>(hm2.values())));// true
		System.out.println(new HashSet<>(hm1.values()).equals(new HashSet<>(hm3.values())));// false
		System.out.println(new HashSet<>(hm1.values()).equals(new HashSet<>(hm5.values())));// true
		
		
		//Sorting HashMap by key or value
		HashMap<String, String> hm6 = new HashMap<>();
		hm6.put("AAA", "aaa");
		hm6.put("BBB", "ccc");
		hm6.put("CCC", "bbb");
		hm6.put("DDD", "ddd");
		hm6.put("EEE", "eee");
		hm6.put("FFF", "fff");
		System.out.println("Before Sorting");
		System.out.println(hm6);
		LinkedList<Entry<String,String>> ll = new LinkedList<>(hm6.entrySet());
		
		
		Collections.sort(ll, new Comparator<Entry<String,String>>() {
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		System.out.println("After Sorting");
		System.out.println(ll);
		for(Entry<String,String> en: ll){
			System.out.println(en.getKey() +"--"+en.getValue());
		}
	}
}
