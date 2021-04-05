package Third.JavaLearning.JavaLearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Number_of_vowels_Words_character_frequency {

	public static void main(String[] args) {
		String name = "Learning Java Course Thru Online.";
		System.out.println(name.length());
		totalwords(name);
		freq(name);

	}

	private static void totalwords(String name) {
		int wordcount =0; int vowelcount =0;int contscount =0;int capscount =0;
		for(char a: name.toCharArray()){
			switch(a){
			case ' ': case '.': wordcount++;break;
			}
			switch(a){
			case 'a': case 'e': case 'i': case 'o': case 'u': 
			case 'A': case 'E': case 'I': case 'O': case 'U':
				vowelcount++;
				break;
			default:
				contscount++;
				break;
			}
			if(a>=65 && a<90){capscount++;}
		}
		System.out.println("Word Count :"+wordcount);
		System.out.println("Vowel Count :"+vowelcount);
		System.out.println("Con Count :"+contscount);
		System.out.println("Cap Count :"+capscount);
	}

	private static void freq(String name) {
		Map<Character, Integer> mp = new HashMap<>();
		for(char a: name.toCharArray()){
		mp.put(a, mp.containsKey(a)?mp.get(a)+1:1);
		}
		for(Entry<Character, Integer> en: mp.entrySet()){
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}
}
