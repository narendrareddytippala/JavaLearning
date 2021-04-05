package Fifth.JavaLearning.JavaLearning.Array;

import java.util.Arrays;

public class GetNegetiveNumberFirst {

	public static void main(String[] args) {
		int a[] = {-1,-20,30,50,40,-8};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));

		int b[] = new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<0){
				b[k]=a[i];
				k++;
			}
		}
		
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				b[k]=a[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}
}
