package NewTest.checking.Array;

import java.util.LinkedHashMap;

public class FindFrequenctOfNumInArray {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 1, 5, 7, 9, 5 };
		LinkedHashMap<Integer, Integer> lh = new LinkedHashMap<>();
		for(int i:a){
			lh.put(i, lh.containsKey(i)?lh.get(i)+1:1);
		}
		lh.forEach((k,v)-> System.out.println(k+"--"+v));
	}

}
