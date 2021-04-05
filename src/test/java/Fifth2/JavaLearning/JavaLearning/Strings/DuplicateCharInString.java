package Fifth2.JavaLearning.JavaLearning.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String a = "aaaaabbcdddeefaagbhd";
		char ch = 'b';
		 int count = 0; 
		 int pos = 2;
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for(char b: a.toCharArray()){
			hm.put(b, hm.containsKey(b)?hm.get(b)+1:1);
		}
		hm.forEach((k,v)-> {
			if(k.equals(ch)){
				System.out.println(k+"---"+v);
			}
		});
		
		for(Entry<Character, Integer> en : hm.entrySet()){
			if(en.getValue()==1){
				count++;
				if(count ==pos){
					System.out.println(en.getKey()+"---"+en.getValue());
				}
			}
		}
		
	}
}
