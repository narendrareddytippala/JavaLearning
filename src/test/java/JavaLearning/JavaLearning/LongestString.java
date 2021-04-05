package JavaLearning.JavaLearning;

import java.util.HashSet;

public class LongestString {
	
	public static void main(String[] args) {
		String a = "abcdabeag";
		String currentval="";
		String finalval="";
		HashSet<Character> hs = new HashSet<Character>();
		for(int i=0;i<a.length();i++){
			char b = a.charAt(i);
		if(hs.contains(b)){
			hs.clear();
			currentval="";
		}
		currentval+=b;
		hs.add(b);
		if(currentval.length()>finalval.length()){
			finalval=currentval;
		}
		}
		System.out.println(finalval);
		
	}
}
