package Fifth.JavaLearning.JavaLearning.Strings;

import java.util.LinkedHashMap;

public class Number_of_vowels_Words_character_frequency {

	public static void main(String[] args) {
		String name = "Learning Java Course Thru Online.";
		WordCharVowConst(name);
		Freq(name);

	}
	public static void WordCharVowConst(String a){
		System.out.println("Total char count :"+a.length());
		int wordcount=0,capcount =0, vowcount=0,constcount=0;
		for(char aa: a.toLowerCase().toCharArray()){
			switch(aa){
			case ' ':
			case '.': wordcount++;
					break;
			case 'a':	
			case 'e':
			case 'i':
			case 'o':
			case 'u': vowcount++;
					break;
			default: constcount++;
					break;
			}
		}
		for(char bb: a.toCharArray()){
			if(bb>=65 && bb<=90){
				capcount++;
			}
		}
		System.out.println("Words count is :"+wordcount);
		System.out.println("Vowel count is :"+vowcount);
		System.out.println("Const count is :"+constcount);
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
