package Fourth.JavaLearning.JavaLearning.Strings;

import java.util.LinkedHashMap;

public class Number_of_vowels_Words_character_frequency {

	public static void main(String[] args) {
		String name = "Learning Java Course Thru Online.";
		System.out.println(name.length());
		getCountVowConstCap(name);
		getRepeatedWords(name);
		getRepeatedchars(name);
	}


	public static void getCountVowConstCap(String a){
		int count=0,vow=0,cont=0,cap=0;
		//System.out.println("Words count is: "+a.split(" ").length);
		for(char b: a.toLowerCase().toCharArray()){
			switch(b){
			case ' ':
			case '.': count++; break;
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': vow++;break;
			default : cont++;break;
			}
		}
		for(char b: a.toCharArray()){
			if(b>=65 && b<=90){
				cap++;
			}
		}
		System.out.println("Words count is:"+count);
		System.out.println("Vowel count is:"+vow);
		System.out.println("Con count is:"+cont);
		System.out.println("Cap count is:"+cap);
	}
	public static void getRepeatedWords(String a){
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		for(String b : a.split(" ")){
			lh.put(b, lh.containsKey(b)?lh.get(b)+1:1);
		}
		lh.forEach((k,v)->System.out.println(k+"---"+v));
	}
	
	public static void getRepeatedchars(String name) {
		LinkedHashMap<Character, Integer> lh = new LinkedHashMap<>();
		for(char b : name.toCharArray()){
			lh.put(b, lh.containsKey(b)?lh.get(b)+1:1);
		}
		lh.forEach((k,v)->System.out.println(k+"---"+v));
		
	}
}
