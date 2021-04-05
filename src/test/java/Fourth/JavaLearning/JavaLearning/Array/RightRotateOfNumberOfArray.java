package Fourth.JavaLearning.JavaLearning.Array;

import java.util.Arrays;

public class RightRotateOfNumberOfArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int rot =3;
		for(int i=0;i<rot;i++){
			int j, first;
			first = a[0];
			for(j=0;j<a.length-1;j++){
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		
//		for(int i = 0;i<rot;i++){
//			int j, last;
//			last=a[a.length-1];
//			for(j=a.length-1;j>0;j--){
//				a[j]=a[j-1];
//			}
//			a[j]= last;
//		}
		
		System.out.println(Arrays.toString(a));
	}
}
