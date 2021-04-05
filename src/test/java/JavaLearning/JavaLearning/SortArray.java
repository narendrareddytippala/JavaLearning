package JavaLearning.JavaLearning;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		int a[] = { 3, 6, 1, 7, 2, 6, 9, 6 };
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//
//		for (int k = 0; k < a.length; k++) {
//			System.out.println(a[k]);
//		}
		
		
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		
		
		Integer b[] = { 3, 6, 1, 7, 2, 6, 9, 6 };
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
		
	}
	

}
