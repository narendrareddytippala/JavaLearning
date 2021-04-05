package Fourth.JavaLearning.JavaLearning.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapLearn {

	public static void main(String[] args) {
		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put("AAA", "aaa");
		hm1.put("BBB", "bbb");
		hm1.put("CCC", "ccc");
		hm1.put("DDD", "ddd");
		hm1.put("EEE", "eee");
		hm1.put("FFF", "fff");
		
		System.out.println(hm1);
		//Iterate with Key
		Iterator<String> it1= hm1.keySet().iterator();
		while(it1.hasNext()){
			String a = it1.next();
			System.out.println("Key: "+a+"--"+"Value: "+hm1.get(a));
		}
		
		//Iterate with Entry Set
		Iterator<Entry<String,String>> it2= hm1.entrySet().iterator();
		while(it2.hasNext()){
			Entry<String,String> en =it2.next();
			System.out.println("Key: "+en.getKey()+"--"+"Value: "+en.getValue());
		}
		
		//foreach loop
		for(Entry<String,String> en: hm1.entrySet()){
			System.out.println("Key: "+en.getKey()+"--"+"Value: "+en.getValue());
		}
		
		//By Lamda
		hm1.forEach((k,v)-> {System.out.println("Key: "+k+"--"+"Value: "+v);});
	}
}
