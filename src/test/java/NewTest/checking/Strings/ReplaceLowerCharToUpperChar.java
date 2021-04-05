package NewTest.checking.Strings;

public class ReplaceLowerCharToUpperChar {

	public static void main(String[] args) {
		String str = "GreAt Power";
		String fin = "";
		for (char a : str.toCharArray()) {
			if (Character.isUpperCase(a)) {
				fin = fin + Character.toLowerCase(a);
			} else if (Character.isLowerCase(a)) {
				fin = fin + Character.toUpperCase(a);
			} else if (a == ' ') {
				fin = fin + ' ';
			}
		}
		System.out.println(fin);
	}

}
