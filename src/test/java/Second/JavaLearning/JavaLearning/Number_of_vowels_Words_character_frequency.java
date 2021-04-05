package Second.JavaLearning.JavaLearning;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Number_of_vowels_Words_character_frequency {

	public static void main(String[] args) {
		String name= "Learning Java Course Thru Online.";
		//Number_of_vowels_Words_character_frequency N= new Number_of_vowels_Words_character_frequency();
		getcount(name);
		getfrequency(name);

	}
	private static void getcount(String name) {
		int wordcount=0; int vowelcount=0; int capcount=0; int concount=0;
		for(char i: name.toCharArray()){
			char c = i;
			switch(c){
			case ' ':
			case '.':	
				wordcount++;
				break;
			}
			switch(c){
			case 'A': case 'E': case 'I': case 'O': case 'U':
			case 'a': case 'e': case 'i': case 'o': case 'u':
				vowelcount++;
				break;
			default:
				concount++;
				break;
			}
			if(c>=65 && c<90){capcount++;}
		}
		System.out.println("Word Count :"+wordcount);
		System.out.println("Vowel Count :"+vowelcount);
		System.out.println("Con Count :"+concount);
		System.out.println("Cap Count :"+capcount);
	}
	
	private static void getfrequency(String name) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//		for(int j=0;j<count.length();j++){
//		if(map.get(count.charAt(j))!=null){
//			map.put(count.charAt(j), map.get(count.charAt(j))+1);
//		}
//		else{map.put(count.charAt(j), 1);}
//		}
//		StringBuffer sb = new StringBuffer();
//		for(Entry<Character, Integer> en: map.entrySet()){
//			sb.append(en.getKey());
//			sb.append(en.getValue());
//			System.out.println(en.getKey()+" "+en.getValue());
			//System.out.println(sb.toString());
//		}
		for (Character ch : name.toCharArray()) {
			map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
		}
		map.forEach((k,v)-> System.out.println(k.toString()+" "+v));
		
	}
}
