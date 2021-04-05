package oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMap_To_ArrayList {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Google", 1);
		hm.put("Facebook", 2);
		hm.put("IBM", 3);
		hm.put("Microsoft", 4);
		hm.forEach((k,v)->{System.out.println(k+"--"+v);});
		Map<String, Integer> mp = new TreeMap<>(hm);
		mp.forEach((k,v)->{System.out.println(k+"--"+v);});
		
		List<String> ls = new ArrayList<>(mp.keySet());
		ls.forEach(a -> {System.out.println(a);});
//		for(String a: ls){
//			System.out.println(a);
//		}
		
		List<Entry<String, Integer>> lsa = new ArrayList<>(mp.entrySet());
		
		
		for(Entry<String, Integer> en: lsa){
			System.out.println(en.getKey()+"---"+en.getValue());
		}
		
//		Map hm = new TreeMap();
//		hm.put("Google", 1);
//		hm.put("Facebook", 2);
//		hm.put("IBM", 3);
//		hm.put("Microsoft", 4);
//		hm.forEach((k,v)->{System.out.println(k+"--"+v);});
	}
}