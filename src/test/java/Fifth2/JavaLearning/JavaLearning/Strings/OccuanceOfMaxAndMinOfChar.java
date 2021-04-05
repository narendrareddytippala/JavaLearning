package Fifth2.JavaLearning.JavaLearning.Strings;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class OccuanceOfMaxAndMinOfChar {

	public static void main(String[] args) {
		 String str = "grass is greener on the other side";
		 LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
			for(char a:str.toCharArray()){
				if(a!=' '){
				lhm.put(a, lhm.containsKey(a)?lhm.get(a)+1:1);
				}
			}
			System.out.println("Before Sort");
			for(Entry<Character, Integer>en: lhm.entrySet()){
				System.out.println(en.getKey()+"--"+en.getValue());
			}
			
			LinkedList<Entry<Character, Integer>> ll = new LinkedList<>(lhm.entrySet());
			Collections.sort(ll, new Comparator<Entry<Character, Integer>>() {

				@Override
				public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
					// TODO Auto-generated method stub
					return o2.getValue().compareTo(o1.getValue());
				}
			});
			System.out.println("Before Sort");
			for(Entry<Character, Integer> en : ll){
				System.out.println(en.getKey()+"--"+en.getValue());
			}
			System.out.println("-----------");
			System.out.println(ll.getFirst());
			System.out.println(ll.getLast());

	}
}
