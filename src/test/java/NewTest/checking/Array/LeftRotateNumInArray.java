package NewTest.checking.Array;

import java.util.Arrays;

public class LeftRotateNumInArray {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int rot = 3;
		for(int i=0;i<rot;i++){
			int j,first;
			first = a[0];
			for(j=0;j<a.length-1;j++){
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		System.out.println(Arrays.toString(a));
	}
}
