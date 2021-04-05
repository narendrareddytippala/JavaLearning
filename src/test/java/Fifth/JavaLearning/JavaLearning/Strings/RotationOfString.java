package Fifth.JavaLearning.JavaLearning.Strings;

public class RotationOfString {

	public static void main(String[] args) {
		String str1 = "abcde", str2 = "deabc";
		str1=str1.concat(str1);
		if(str1.indexOf(str2)!=-1){
			System.out.println("String is RotationOfString");
		}

	}

}
