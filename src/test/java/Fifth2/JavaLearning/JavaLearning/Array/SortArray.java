package Fifth2.JavaLearning.JavaLearning.Array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a[] = { 2, 6, 8, 3, 1, 5, 9 };
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j]>a[i]){
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println(Arrays.toString(a));
	}

}
