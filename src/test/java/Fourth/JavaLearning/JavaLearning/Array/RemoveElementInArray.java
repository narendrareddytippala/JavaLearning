package Fourth.JavaLearning.JavaLearning.Array;

import java.util.Arrays;

public class RemoveElementInArray {

	public static void main(String[] args) {
		int a[]=  {1,2,3,4,5};
		int b[]= new int [a.length-1];
		int rem = 3,k=0;
		for(int i: a){
			if(i!=rem){
				b[k]=i;
				k++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
