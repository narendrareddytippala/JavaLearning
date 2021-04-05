package Fifth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompareAndSort {

	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "A");
		hm1.put(2, "B");
		hm1.put(3, "C");

		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(1, "A");
		hm2.put(3, "C");
		hm2.put(2, "B");
	
		HashMap<Integer, String> hm3 = new HashMap<>();
		hm3.put(1, "A");
		hm3.put(3, "C");
		hm3.put(2, "B");
		hm3.put(3, "D");
		
		HashMap<Integer, String> hm4 = new HashMap<>();
		hm4.put(1, "A");
		hm4.put(2, "B");
		hm4.put(3, "C");
		hm4.put(4, "D");

		//Default compare will be key+value
		System.out.println(hm1.equals(hm2));
		System.out.println(hm1.equals(hm3));
		
		//Compare by key
		System.out.println(hm1.keySet().equals(hm2.keySet()));
		System.out.println(hm1.keySet().equals(hm3.keySet()));
		System.out.println(hm3.keySet().equals(hm4.keySet()));
		
		//Compare by values
		System.out.println(new ArrayList<>(hm1.values()).equals(new ArrayList<>(hm2.values())));
		System.out.println(new ArrayList<>(hm1.values()).equals(new ArrayList<>(hm3.values())));
		System.out.println(new ArrayList<>(hm3.values()).equals(new ArrayList<>(hm4.values())));
		
		HashMap<Integer, String> hm5 = new HashMap<>();
		hm5.put(1, "A");
		hm5.put(2, "B");
		hm5.put(3, "C");
		hm5.put(5, "D");
		
		HashMap<Integer, String> hm6 = new HashMap<>();
		hm6.put(1, "A");
		hm6.put(2, "B");
		hm6.put(3, "C");
		hm6.put(4, "C");
		
		HashSet<Integer> hs1 = new HashSet<Integer>(hm5.keySet());
//		hs1.removeAll(hm4.keySet());
		hs1.retainAll(hm4.keySet());
		System.out.println(hs1);
		
	}
}
