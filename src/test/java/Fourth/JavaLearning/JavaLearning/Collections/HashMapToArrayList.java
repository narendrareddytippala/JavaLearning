package Fourth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapToArrayList {

	public static void main(String[] args) {
		HashMap<String, Integer> data = new HashMap<>();
		data.put("IBM", 30000);
		data.put("Apple", 44000);
		data.put("Google", 24000);
		data.put("Amazon", 55000);
		
		data.forEach((k,v)-> {System.out.println(k+"--"+v);});
		
		ArrayList<String> cmpname = new ArrayList<>(data.keySet());
		for(String a: cmpname){
			System.out.println(a);
		}
		ArrayList<Integer> cmpemp = new ArrayList<>(data.values());
		for(int a: cmpemp){
			System.out.println(a);
		}
		
		//Sort by Key
		ArrayList<Entry<String, Integer>> total = new ArrayList<>(data.entrySet());
		Collections.sort(total, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		for(Entry<String, Integer> en: total){
			System.out.println(en.getKey()+"--"+en.getValue());
		}
		
		//Sort by value
				ArrayList<Entry<String, Integer>> totalval = new ArrayList<>(data.entrySet());
				Collections.sort(totalval, new Comparator<Entry<String, Integer>>() {
					@Override
					public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
						return o1.getValue().compareTo(o2.getValue());
					}
				});
				for(Entry<String, Integer> en: totalval){
					System.out.println(en.getKey()+"--"+en.getValue());
				}	
	}
}
