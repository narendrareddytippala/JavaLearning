package Second.JavaLearning.JavaLearning;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

public class Find_first_non_repeated_character {

	public static void main(String[] args) {
		String a = "aabbdef";
		char out = 0 ;
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		for (Character g : a.toCharArray()) {
			
//		}
//		
//		for(int i = 0;i<a.length();i++){
			mp.put(g, mp.containsKey(g) ? mp.get(g)+1:1);
		}
//			if(mp.get(a.charAt(i))==null){
//				mp.put(a.charAt(i), 1);
//			}
//			else{
//				mp.put(a.charAt(i), mp.get(a.charAt(i))+1);
//			}
//		}
//		for(Entry<Character, Integer> en:mp.entrySet()){
//			if(en.getValue()==1){
//				System.out.println(en.getKey());
//			}
//		}
//		for(Character ch : mp.keySet()) {
//			System.out.print(ch+mp.get(ch).toString());
//		}
		mp.forEach((k,v)->System.out.print(k.toString()+v));
		System.out.println("-----------------");
		for(Entry<Character, Integer> en : mp.entrySet() ){
			System.out.print(en.getKey()+en.getValue().toString());
		}
	}
}
