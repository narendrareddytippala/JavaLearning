package Third.JavaLearning.JavaLearning;

public class First_letter_ofeach_word {

	public static void main(String[] args) {
		String name = "Hello Java World";
		String[] a =name.split(" ");
		for(int i =0;i<a.length;i++){
			System.out.println(a[i].charAt(0));
		}
	}
}
