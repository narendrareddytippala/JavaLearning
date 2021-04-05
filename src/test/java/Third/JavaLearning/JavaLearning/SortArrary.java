package Third.JavaLearning.JavaLearning;

import java.util.Arrays;
import java.util.Collections;

public class SortArrary {

	public static void main(String[] args) {
		int a[]={2,6,8,3,1,5,9};
		int min = a[0];
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp = a[j];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		Integer b[]={2,6,8,3,1,5,9};
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
	}
}
