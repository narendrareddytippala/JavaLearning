package NewTest.checking.Array;

import java.util.Arrays;

public class SortArrayInAsc {

	public static void main(String[] args) {
		int a[] = { 5, 2, 8, 7, 1 };
		//Arrays.sort(a);
		int min =a[0],max=a[0];
		for(int i =0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>=a[j]){
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
