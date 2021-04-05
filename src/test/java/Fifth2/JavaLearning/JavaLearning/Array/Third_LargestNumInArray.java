package Fifth2.JavaLearning.JavaLearning.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Third_LargestNumInArray {

	public static void main(String[] args) {
		Integer a[] = { 5, 2, 8, 7, 1,9,14,3,19 };
	    Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		System.out.println(a[2]);
		
		
		int b[] = { 5, 2, 8, 7, 1,9,14,3,19 };
		for(int i=0;i<b.length;i++){
			for(int j=i+1;j<b.length;j++){
				if(b[j]>b[i]){
					int temp= b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
