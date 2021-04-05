package NewTest.checking.Array;

import java.util.Arrays;

public class RightRotateOfNumberOfArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int rot =3;
		int len = a.length;
		for(int i =0 ;i< rot;i++){
			int j, last;
			last = a[len-1];
			for(j=len-1;j>0;j--){
				a[j]=a[j-1];
			}
			a[j]=last;
		}
			System.out.println(Arrays.toString(a));
	}
}
