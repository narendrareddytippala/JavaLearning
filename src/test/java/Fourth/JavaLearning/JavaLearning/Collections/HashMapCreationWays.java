package Fourth.JavaLearning.JavaLearning.Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapCreationWays {
	public static HashMap<String, String> hm = new HashMap<>();
	
	static{
		hm.put("AAA", "aaa");
		hm.put("BBB", "bbb");
	}
	
	public static void main(String[] args) {
			//Regular
		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put("SS", "aaa");
		
		//By static way
			System.out.println(hm.get("AAA"));
			
		// Immutable map with only one entry
			Map<Integer,String> mp1=Collections.singletonMap(1, "Alpha");
			System.out.println(mp1);
//			mp1.put(2, "eee"); // unsupportedOperationException
			
		//Unmodify map
			Map<String,String> mp2=Collections.unmodifiableMap(hm1);
			mp2.put("SS", "ddd");
//			System.out.println(mp2);// unsupportedOperationException
		
		//Sycn Hashmap creation 	
		Map<String,String> mp3=	Collections.synchronizedMap(hm1);
		
		//ConcurrentHashMap creation
		ConcurrentHashMap<String, String> chm=new ConcurrentHashMap<>();

	}

}
