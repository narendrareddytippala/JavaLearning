package Fifth2.JavaLearning.JavaLearning.Array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i]=a[(a.length-i)-1];
		}
		System.out.println(Arrays.toString(b));
		
		int aa[]={1,2,3,4,5};
		int bb[] = new int[aa.length];
		int l=0;
		for(int i=aa.length-1;i>=0;i--){
			bb[i]=aa[l];
			l++;
		}
		System.out.println(Arrays.toString(bb));
	}
}
