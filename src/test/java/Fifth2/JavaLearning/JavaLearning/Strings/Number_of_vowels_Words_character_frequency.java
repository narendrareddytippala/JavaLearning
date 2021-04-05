package Fifth2.JavaLearning.JavaLearning.Strings;

import java.util.LinkedHashMap;

public class Number_of_vowels_Words_character_frequency {

	public static void main(String[] args) {
		String name = "Learning Java Course Thru Online.";
		count(name);
		Freq(name);
	}
	public static void count(String a){
		System.out.println("Total char count with space:"+a.length());
	    int wordscount=0,vowel=0,cont=0,capcount=0;
		for(char b: a.toLowerCase().toCharArray()){
			switch(b){
			case ' ':
			case '.': wordscount++;
			break;
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':vowel++;
			break;
			default:cont++;
			break;
			}	
		}

		for(char c: a.toCharArray()){
			if(c>=65 && c<=90){
				capcount++;
			}
		}		
		System.out.println("Words count is :"+wordscount);
		System.out.println("Vowel count is :"+vowel);
		System.out.println("Const count is :"+cont);
		System.out.println("Cap count is :"+capcount);
	}
	
	public static void Freq(String b){
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		for(char bb:b.toCharArray()){
			lhm.put(bb, lhm.containsKey(bb)?lhm.get(bb)+1:1);
		}
		lhm.forEach((k,v)->{
			System.out.println(k+"--"+v);
		});
	}

}
