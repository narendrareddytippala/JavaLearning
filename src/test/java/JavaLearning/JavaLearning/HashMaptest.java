package JavaLearning.JavaLearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaptest {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(0, "Apple");
		mp.put(1, "Bpple");
		mp.put(2, "Cpple");
		mp.put(3, "Dpple");
		mp.put(4, "Epple");
	
		System.out.println(mp);
		Set se=mp.entrySet();
		 Iterator it=se.iterator();
		 while(it.hasNext()){
			// Map.Entry me=(Map.Entry)it.next();
			 //System.out.println(me.getKey()+"---"+me.getValue());
			 Entry me= (Entry) it.next();
			 System.out.println(me.getKey()+"---"+me.getValue());
		 }
System.out.println("--------");
		 for (Entry <Integer,String>  en: mp.entrySet()) {
			 System.out.println(en.getKey()+"---"+en.getValue());
		}
		 
// HapMap is non sync and not thread safe.. Hasptable is synce and thread safe(will run one by one)
// Hashmap can have null value... Hashtable can't have null value
//hashmap use iterator... hashtable use enumerator
	}

}
