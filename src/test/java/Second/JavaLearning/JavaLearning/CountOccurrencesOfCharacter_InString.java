package Second.JavaLearning.JavaLearning;

import java.util.ArrayList;

public class CountOccurrencesOfCharacter_InString {

	public static void main(String[] args) {
		String name = "Hello Java Program Help";
		ArrayList<Character> ar = new ArrayList<Character>();
		for(int i=0;i<name.length();i++){
			int k=0;
			if(!ar.contains(name.charAt(i))){
				ar.add(name.charAt(i));
				k++;
				for(int j=i+1;j<name.length();j++){
					if(name.charAt(i)==name.charAt(j)){
						k++;
					}
				}
				System.out.println(name.charAt(i)+"--"+k);
			}
		}
	}
}
