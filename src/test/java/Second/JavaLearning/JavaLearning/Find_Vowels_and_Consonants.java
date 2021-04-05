package Second.JavaLearning.JavaLearning;

public class Find_Vowels_and_Consonants {

	public static void main(String[] args) {
		String name = "narendra";
		String vowel = "aeiou";
		int vowelcount = 0;
		int concount = 0;
//		for (int i = 0; i < name.length(); i++) {
//			for (int j = 0; j < vowel.length(); j++) {
//				if (name.charAt(i) == vowel.charAt(j)) {
//					vowelcount++;
//				} 
//			}
//		}
//		concount=name.length()-vowelcount;
//		System.out.println("Vowel count:" + vowelcount);
//		System.out.println("Concount count:" + concount);
		
		for (int i = 0; i < name.length(); i++) {
			if(isvowel(name.charAt(i))){
				vowelcount++;
			}
			else{concount++;}
		}
		System.out.println("Vowel count:" + vowelcount);
		System.out.println("Concount count:" + concount);
	}

	private static boolean isvowel(char ch) {
		//ch=Character.toUpperCase(ch);
		return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
	}

}
