package Second.JavaLearning.JavaLearning;

import java.util.ArrayList;

public class Repeating_element_inArray {

	public static void main(String[] args) {
		int a[] = { 4, 2, 3, 5, 1, 2, 4 };
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ar.contains(a[i])) {
				ar.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				if (k > 1) {
					System.out.println(a[i]);
					System.out.println(a[i] + "--" + k);
				}
			}
		}
	}
}
