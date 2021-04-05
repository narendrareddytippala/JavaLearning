package JavaLearning.JavaLearning;

public class Pyramidnumber {

	public static void main(String[] arg) {
		int k = 1;
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}

		int b = 1;
		for (int a = 0; a <= 5; a++) {
			for (int c = 1; c <= a; c++) {
				System.out.print(b);
				System.out.print('\t');
				b++;
			}
			System.out.println();
		}
	}
}
