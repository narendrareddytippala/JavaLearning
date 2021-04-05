package Fourth.JavaLearning.JavaLearning.Array;

import java.util.Arrays;

public class RemoveDuplicateFomArray {

	public static void main(String[] args) {
		int a[] = {10,20,20,30,30,40,50,50};  
		int b[] = new int[8];
		int k=0;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length-1;j++){
				if(a[i]!=a[j]){				
					b[k]=a[i];
					k++;
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
