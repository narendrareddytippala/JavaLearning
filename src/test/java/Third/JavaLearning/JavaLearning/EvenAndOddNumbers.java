package Third.JavaLearning.JavaLearning;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		int num = 1235678;
		int even = 0; int odd = 0;
		for (char b : String.valueOf(num).toCharArray()) {
			int a = (b%2==0) ? even++ : odd++;
		}
		System.out.println("Even :"+even+" Odd :"+odd);
	}
}
