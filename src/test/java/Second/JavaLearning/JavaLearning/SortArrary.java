package Second.JavaLearning.JavaLearning;

import java.util.Arrays;
import java.util.Collections;

public class SortArrary {

	public static void main(String[] args) {
		int a[]={2,6,8,3,1,5,9};
// Method 01
//		for(int i=0;i<=a.length;i++){
//			for(int j=i+1;j<a.length;j++){
//				if(a[i]>a[j]){
//				int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		for(int j=0;j<=a.length-1;j++){
//			System.out.println(a[j]);
//		}
// Method 02
		//Arrays.toString(a);
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
// Method 03
			Integer b[]={2,6,8,3,1,5,9};
				Arrays.sort(b,Collections.reverseOrder());
				System.out.println(Arrays.toString(b));
	}

}
