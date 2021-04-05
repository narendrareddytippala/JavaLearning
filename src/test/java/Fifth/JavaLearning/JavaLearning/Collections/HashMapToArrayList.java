package Fifth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapToArrayList{

	public static HashMap<String, Integer> data = new HashMap<>();
	public static void main(String[] args) {
		 
		data.put("IBM", 30000);
		data.put("Apple", 44000);
		data.put("Google", 24000);
		data.put("Amazon", 55000);
		
		ArrayList<String> al1 = new ArrayList<>(data.keySet());
		for(String a: al1){
			System.out.println(a);
		}
		
		ArrayList<Integer> al2 = new ArrayList<>(data.values());
		for(int a: al2){
			System.out.println(a);
		}
		
		//Sort by Keys
		ArrayList<Entry<String, Integer>> al3 = new ArrayList<>(data.entrySet());
		Collections.sort(al3, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		
		for(Entry<String, Integer> en: al3){
			System.out.println(en.getKey()+"--"+en.getValue());
		}
		
		//Sort by Values
		ArrayList<Entry<String, Integer>> al4 = new ArrayList<>(data.entrySet());
		Collections.sort(al4, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		for(Entry<String, Integer> en: al4){
			System.out.println(en.getKey()+"--"+en.getValue());
		}
	}
}
