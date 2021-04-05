package Second.JavaLearning.JavaLearning;

import java.util.Arrays;

public class RemoveElementInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int num = 2;
		int k = 0;
		int b[] = new int[a.length - 1];
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (i!= num) {
				b[k] = a[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
