package Fifth.JavaLearning.JavaLearning.Strings;

public class FirstCharToUpper {

	public static void main(String[] args) {
		String a = "this is javatpoint";
		String word="";
		for(String aa:a.split(" ")){
			String b=aa.substring(0,1).toUpperCase();
			String bb = aa.substring(1, aa.length());
			word=word+b+bb+" ";
		}
		System.out.println(word);
	}
}
