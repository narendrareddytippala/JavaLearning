package Second.JavaLearning.JavaLearning;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class String_compression {

	public static void main(String[] args) {
		//String s = "aaabbbbccccc";
		String s = "aaababbccbccbc";
//Method: 01
//		ArrayList<Character> ar = new ArrayList<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			int k = 0;
//			if (!ar.contains(s.charAt(i))) {
//				ar.add(s.charAt(i));
//				k++;
//				for (int j = i + 1; j < s.length(); j++) {
//					if (s.charAt(i) == s.charAt(j)) {
//						k++;
//					}
//				}
//				System.out.print(s.charAt(i) + "" + k);
//			}
//		}
		
//Method: 02		
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s.length();i++){
			if(map.get(s.charAt(i))!=null){
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else{
				map.put(s.charAt(i), 1);
			}
		}
		
		//////
//		for (Character a : map.keySet()) {
//			System.out.print(a+(map.get(a).toString()));
//		}
		///////
		
		//StringBuilder sb = new StringBuilder();
		for(Entry<Character,Integer> en: map.entrySet()){
			//sb.append(en.getKey());
			//sb.append(en.getValue());
		   	  System.out.print(en.getKey()+en.getValue().toString());
		}
		//System.out.println(sb.toString());
	}
}
