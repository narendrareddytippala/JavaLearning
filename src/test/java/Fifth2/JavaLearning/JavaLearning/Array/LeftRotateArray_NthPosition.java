package Fifth2.JavaLearning.JavaLearning.Array;

import java.util.Arrays;

public class LeftRotateArray_NthPosition {

	public static void main(String[] args) {
		//Left rotation
		int a[]={10,20,30,40,50};
		int rot =2;
		for(int i=0;i<rot;i++){
			int first = a[0],j;
			for(j=0;j<a.length-1;j++){
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		System.out.println(Arrays.toString(a));
		
		//Right rotation
		int a1[]={10,20,30,40,50};
		int rot1 =2;
		for(int i=0;i<rot1;i++){
			int last = a1[a1.length-1],j;
			for(j=a1.length-1;j>0;j--){
				a1[j]=a1[j-1];
			}
			a1[j]=last;
		}
		System.out.println(Arrays.toString(a1));
	}
}
