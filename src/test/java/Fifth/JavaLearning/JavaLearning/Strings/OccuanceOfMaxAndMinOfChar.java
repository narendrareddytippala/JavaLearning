package Fifth.JavaLearning.JavaLearning.Strings;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class OccuanceOfMaxAndMinOfChar {

	public static void main(String[] args) {
		 String str = "grass is greener on the other side"; 
//		 int max =1; char maxkey = 0 ;
		 LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
			for(char a:str.toCharArray()){
				lhm.put(a, lhm.containsKey(a)?lhm.get(a)+1:1);
			}
			System.out.println("Before Sort");
			for(Entry<Character, Integer>en: lhm.entrySet()){
				System.out.println(en.getKey()+"--"+en.getValue());
			}
//			for(Entry<Character, Integer>en: lhm.entrySet()){
//				if(en.getValue()>=max){
//					max=en.getValue();
//					maxkey =en.getKey();
//				}
//			}
//			System.out.println(maxkey+"--"+lhm.get(maxkey));
			
			LinkedList<Entry<Character, Integer>> ll = new LinkedList<>(lhm.entrySet());
			Collections.sort(ll, new Comparator<Entry<Character, Integer>>() {

				@Override
				public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
					return o1.getValue().compareTo(o2.getValue());
				}
			});
			System.out.println("After Sort"); 
		      ll.forEach(a->System.out.println(a.getKey()+"---"+a.getValue()));
		     
		      System.out.println("Max is "+ll.getLast());
		      System.out.println("Min is "+ll.getFirst());
		      
		      int min = 1,max=0;
			  Character minst=null;
			  Character maxst = null;
		      for(Entry<Character, Integer> newen : ll)  {
		    	  if(newen.getValue()>=max){
			    		max=newen.getValue();
			    		maxst=newen.getKey();
			    	}
			    	if(newen.getValue()<=min){
			    		min=newen.getValue();
			    		minst=newen.getKey();
			    	}
		      }
		      System.out.println("Max Char is "+maxst+"--"+max);
			  System.out.println("Min Char is "+minst+"--"+min);
	}
}
