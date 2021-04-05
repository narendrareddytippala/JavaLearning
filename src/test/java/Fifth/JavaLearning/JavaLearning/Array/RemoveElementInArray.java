package Fifth.JavaLearning.JavaLearning.Array;

import java.util.Arrays;

public class RemoveElementInArray {

	public static void main(String[] args) {
		int a[]=  {1,2,3,4,5};
		int b[] = new int[a.length-1];
		int k=0;
		for(int i=0;i<a.length;i++){
			if(i!=3){
				b[k]=a[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
