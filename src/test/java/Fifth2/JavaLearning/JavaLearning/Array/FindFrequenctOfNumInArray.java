package Fifth2.JavaLearning.JavaLearning.Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class FindFrequenctOfNumInArray {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 1, 5, 7, 9, 5 };
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int b: a){
			hm.put(b, hm.containsKey(b)?hm.get(b)+1:1);
		}
		for(Entry<Integer,Integer> en: hm.entrySet()){
			System.out.println(en.getKey()+"--"+en.getValue());
		}
		System.out.println("------------------------");
		hm.forEach((k,v)->System.out.println(k+"--"+v));
		System.out.println("------------------------");
		Set<Integer> ks=hm.keySet();
		Iterator<Integer> it= ks.iterator();
		while(it.hasNext()){
			int k = it.next();
			System.out.println(k+"--"+hm.get(k));
		}
	}
}
