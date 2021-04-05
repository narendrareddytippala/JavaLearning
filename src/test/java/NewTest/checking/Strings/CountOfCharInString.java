package NewTest.checking.Strings;

public class CountOfCharInString {

	public static void main(String[] args) {
		String name = "The best of both worlds";
		int count=0;
		System.out.println(name.length());
		for(char a : name.toCharArray()){
			if(a!=' '){
				count++;
			}
		}
		System.out.println(count);
	}
}
