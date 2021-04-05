package Fifth.JavaLearning.JavaLearning.Array;

import java.util.Arrays;

public class Third_LargestNumInArray {

	public static void main(String[] args) {
		int a[] = { 5, 2, 8, 7, 1 };
		int max = a[0];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]<a[j]){
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[2]);
		
		int bb[] = { 5, 2, 8, 7, 1 };
		Arrays.sort(bb);
		System.out.println(bb[3]);
	}
}
