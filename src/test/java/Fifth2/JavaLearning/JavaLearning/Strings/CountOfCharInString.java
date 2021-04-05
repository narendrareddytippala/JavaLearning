package Fifth2.JavaLearning.JavaLearning.Strings;

public class CountOfCharInString {

	public static void main(String[] args) {
		String name = "The best of both worlds";
		int withspace=0, withoutspace=0;
		for(char a:name.toCharArray()){
			withspace++;
			if(a!=' '){
				withoutspace++;
			}
		}
		System.out.println("With space "+withspace);
		System.out.println("Without space "+withoutspace);
	}
}
