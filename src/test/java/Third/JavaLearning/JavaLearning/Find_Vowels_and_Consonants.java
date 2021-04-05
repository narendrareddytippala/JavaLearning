package Third.JavaLearning.JavaLearning;

public class Find_Vowels_and_Consonants {

	public static void main(String[] args) {
		String name = "narendra";
		int vowel = 0;
		int cont = 0;
		for (char a : name.toCharArray()) {
			if (getcount(a)) {
				vowel++;
			} else {
				cont++;
			}
		}
		System.out.println("Vowel count:" + vowel);
		System.out.println("Concount count:" + cont);
	}

	private static boolean getcount(char a) {
		return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u');
	}
}
