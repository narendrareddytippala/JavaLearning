package oops;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.omg.Messaging.SyncScopeHelper;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		String name = "Hey java is java best language is java";
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		for(String bb:name.split(" ")){
			ht.put(bb, ht.containsKey(bb)?ht.get(bb)+1:1);
		}
		for(Entry<String, Integer> en: ht.entrySet()){
			System.out.println(en.getKey()+"--"+en.getValue());
		}
		
		System.out.println("-----------------");
		HashMap<String, Integer> hm = new LinkedHashMap<>();
		for(String bb:name.split(" ")){
			hm.put(bb, hm.containsKey(bb)?hm.get(bb)+1:1);
		}
		hm.forEach((k,v)-> System.out.println(k+"--"+v));
		System.out.println("-----------------");
		for(Entry<String, Integer> en: hm.entrySet()){
			System.out.println(en.getKey()+"--"+en.getValue());
		}
	}
}
