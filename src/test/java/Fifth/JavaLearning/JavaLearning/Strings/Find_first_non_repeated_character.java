package Fifth.JavaLearning.JavaLearning.Strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Find_first_non_repeated_character {

	public static void main(String[] args) {
		String a = "aabbdef";
		int count=0;
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		for(char b:a.toCharArray()){
			lhm.put(b, lhm.containsKey(b)?lhm.get(b)+1:1);	
		}
		for(Entry<Character, Integer> en: lhm.entrySet()){
			if(en.getValue()==1){
				count++;
			}
			if(count == 2){
				System.out.println(en.getKey()+"--"+en.getValue());
			}
		}
		
//		lhm.forEach((k,v)->{
//			if(v==1){
//				count++;
//			}
//		});
	}
}
