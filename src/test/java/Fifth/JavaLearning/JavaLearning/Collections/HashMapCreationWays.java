package Fifth.JavaLearning.JavaLearning.Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapCreationWays {

	public static HashMap<Integer, String> hm2= new HashMap<>();
	static
	{
		hm2.put(1, "DDD");
		hm2.put(2, "EEE");
		hm2.put(3, "FFF");
	}
	public static void main(String[] args) {
		//Default way
		HashMap<Integer, String> hm1= new HashMap<>();
		hm1.put(1, "AAA");
		hm1.put(2, "BBB");
		hm1.put(3, "CCC");
		System.out.println(hm1);
		
		//Static way
		System.out.println(hm2);
		
		// Immutable map with only one entry
		Map<Integer, String> hm3 = Collections.singletonMap(1, "ZZZ");
//		h3.put(2, "d");
		
		//Unmodify map
		Map<Integer, String> hm4= Collections.unmodifiableMap(hm1);
//		hm4.put(1, "dddd");
		
		//Sycn Hashmap creation 	
		Map<Integer, String> hm5= Collections.synchronizedMap(hm1);
		
		//ConcurrentHashMap creation
		ConcurrentHashMap<Integer, String> hm6 = new ConcurrentHashMap<Integer, String>();
	}
}
