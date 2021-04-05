package Fourth.JavaLearning.JavaLearning.Strings;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;

import Second.JavaLearning.JavaLearning.Sort_hashmap_ByKeys;

public class OccuanceOfMaxAndMinOfChar {

	public static void main(String[] args) {
	      String str = "grass is greener on the other side";   
	      LinkedHashMap<Character, Integer> lh = new LinkedHashMap<>();
	      for(Character a: str.toCharArray()){
	    	  lh.put(a, lh.containsKey(a)?lh.get(a)+1:1);
	      }
	      System.out.println("Orginal");
	      for(Entry<Character, Integer> en:lh.entrySet()){
	    	 System.out.println(en.getKey()+"--"+en.getValue());  
	      }
	      
	      LinkedList<Entry<Character, Integer>> list = new LinkedList<Entry<Character, Integer>>(lh.entrySet());
	      Collections.sort(list, new Comparator<Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
	      System.out.println("After Sort"); 
	      list.forEach(a->System.out.println(a));
	      
	      int min = 1,max=0;
	    Character minst=null;
		Character maxst = null;
	    for(Entry<Character, Integer> newen : list)  {
	    	if(newen.getValue()>=max){
	    		max=newen.getValue();
	    		maxst=newen.getKey();
	    	}
	    	if(newen.getValue()<=min){
	    		min=newen.getValue();
	    		minst=newen.getKey();
	    	}
	    	//System.out.println("Max is "+newen.getKey());
	    }
	    System.out.println("Max Char is "+maxst+"--"+max);
	    System.out.println("Min Char is "+minst+"--"+min);	}
}
