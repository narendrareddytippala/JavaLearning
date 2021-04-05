package Fifth.JavaLearning.JavaLearning.Strings;

public class First_letter_ofeach_word {

	public static void main(String[] args) {
		String name = "Hello Java World";
		for(String a:name.split(" ")){
			System.out.println(a.charAt(0));
		}

	}

}
