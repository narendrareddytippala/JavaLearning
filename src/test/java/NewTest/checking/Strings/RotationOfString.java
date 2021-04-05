package NewTest.checking.Strings;

public class RotationOfString {

	public static void main(String[] args) {
		String str1 = "abcde", str2 = "deabc";
		str1=str1.concat(str1);
		if(str1.contains(str2))
			System.out.println("String Rotated");
	}
}
