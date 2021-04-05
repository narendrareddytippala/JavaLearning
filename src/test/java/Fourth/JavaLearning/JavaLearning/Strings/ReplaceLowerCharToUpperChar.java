package Fourth.JavaLearning.JavaLearning.Strings;

public class ReplaceLowerCharToUpperChar {

	public static void main(String[] args) {
		String str = "Great Power";
		String str1 = "";
		for(char a: str.toCharArray()){
			if(Character.isUpperCase(a)){
				str1=str1+Character.toLowerCase(a);
			}
			else if(Character.isLowerCase(a)){
				str1=str1+Character.toUpperCase(a);
			}
			else if(a==' '){
				str1=str1+' ';
			}
		}
System.out.println(str1);
	}

}
