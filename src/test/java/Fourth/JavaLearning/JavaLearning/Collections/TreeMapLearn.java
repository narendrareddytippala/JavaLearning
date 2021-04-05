package Fourth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class TreeMapLearn {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("Gearge", 200);
		tm.put("James", 100);
		tm.put("Bond", 800);
		tm.put("Harry", 900);
		tm.put("Ali", 500);
		tm.put("Baba", 600);
		
		tm.forEach((k,v)->{System.out.println(k+"--"+v);});
		System.out.println("Reverse order---------");
		TreeMap<String, Integer> tm1 = new TreeMap<>(Collections.reverseOrder());
		tm1.put("Gearge", 200);
		tm1.put("James", 100);
		tm1.put("Bond", 800);
		tm1.put("Harry", 900);
		tm1.put("Ali", 500);
		tm1.put("Baba", 600);
		tm1.forEach((k,v)->{System.out.println(k+"--"+v);});
		
		
		
		Vector<Integer> vv = new Vector<>();
		vv.add(1);
		vv.add(2);
		vv.add(null);
		vv.add(null);
		System.out.println(Arrays.asList(vv));
	}
}
