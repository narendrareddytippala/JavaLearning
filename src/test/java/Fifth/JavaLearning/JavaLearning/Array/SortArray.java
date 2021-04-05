package Fifth.JavaLearning.JavaLearning.Array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a[] = { 2, 6, 8, 3, 1, 5, 9 };
		int min = a[0], max =a[0];
		//Desc order
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
			if(a[i]<a[j]){
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
