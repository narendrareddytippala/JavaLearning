package Fifth.JavaLearning.JavaLearning.Strings;

public class ReverseStringByRecursive {

	public static void main(String[] args) {
		String name = "apple";
		int len = name.length();
		reverstring(name,len);

	}
	public static void reverstring(String a, int len){
		if(len>0){
			System.out.print(a.charAt(len-1));
			len--;
			reverstring(a,len);
		}
	}
}
