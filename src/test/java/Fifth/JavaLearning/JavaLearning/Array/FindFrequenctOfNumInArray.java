package Fifth.JavaLearning.JavaLearning.Array;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindFrequenctOfNumInArray {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 1, 5, 7, 9, 5 };
		LinkedHashMap<Integer, Integer> lh = new LinkedHashMap<>();
		for(int i:a){
			lh.put(i, lh.containsKey(i)?lh.get(i)+1:1);
		}
		lh.forEach((k,v)->{System.out.println(k +"--"+v);});
		System.out.println("--------------------------");
		for(Entry<Integer, Integer> en: lh.entrySet()){
			System.out.println(en.getKey() +"--"+en.getValue());
		}
		System.out.println("--------------------------");
		Set<Integer> st=lh.keySet();
		Iterator<Integer> it= st.iterator();
		while(it.hasNext()){
			int key=it.next();
			System.out.println(key +"--"+lh.get(key));
		}
		System.out.println("--------------------------");
		for(Entry<Integer, Integer> bb:lh.entrySet()){
			System.out.println(bb.getKey() +"--"+bb.getValue());
		}
	}
}
