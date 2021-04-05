package Fifth.JavaLearning.JavaLearning.Array;

import java.util.Arrays;

public class LeftRotateArray_NthPosition {

	public static void main(String[] args) {
		
		//Left rotation
		int a[]={10,20,30,40,50};
		int rot = 3;
		for(int i=0;i<rot;i++){
			int j,first=a[0];
			for(j=0;j<a.length-1;j++){
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		System.out.println(Arrays.toString(a));
		
		//Right rotation
		int b[]={10,20,30,40,50};
		int rotb = 3;
		for(int i=0;i<rotb;i++){
			int j, last=b[b.length-1];
			for(j=b.length-1;j>0;j--){
				b[j]=b[j-1];
			}
			b[j]=last;
		}
		System.out.println(Arrays.toString(b));
	}
}
