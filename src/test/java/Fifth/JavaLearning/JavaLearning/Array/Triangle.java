package Fifth.JavaLearning.JavaLearning.Array;

public class Triangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("\t");
			}
			for (int j = 1; j < (i * 2); j++) {
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
