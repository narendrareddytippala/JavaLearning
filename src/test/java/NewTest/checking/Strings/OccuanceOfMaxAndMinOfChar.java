package NewTest.checking.Strings;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class OccuanceOfMaxAndMinOfChar {
	static int  max = 1, min = 1, count = 0;
	static String maxstr="",minstr ="";
	public static void main(String[] args) {
		String str = "grass is greener on the other side";
		
		
		
		LinkedHashMap<Character, Integer> lh = new LinkedHashMap<>();
		for (char a : str.toCharArray()) {
			lh.put(a, lh.containsKey(a) ? lh.get(a) + 1 : 1);
		}
		lh.forEach((k, v) -> {
			System.out.println(k + "--" + v);
		});
		System.out.println("-------------Sorted Value");
		LinkedList<Entry<Character, Integer>> ls = new LinkedList<Entry<Character, Integer>>(lh.entrySet());
		Collections.sort(ls, new Comparator<Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		ls.forEach(a->{System.out.println(a);
		if(a.getValue()>=max){
			max = a.getValue();
			maxstr = a.getKey().toString();
		}
		if(a.getValue()<=min){
			min = a.getValue();
			minstr = a.getKey().toString();
		}
		});
		System.out.println("Min is :"+minstr+"--"+min);
		System.out.println("Max is "+maxstr+"--"+max);
	}
}