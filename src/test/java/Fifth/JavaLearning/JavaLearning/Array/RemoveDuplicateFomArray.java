package Fifth.JavaLearning.JavaLearning.Array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFomArray {

	public static void main(String[] args) {
		int a[] = {10,20,20,30,30,40,50,50,20,10,30};  
		int b[] = new int[a.length];
		int l=0;	
		for(int i=0;i<a.length;i++){
			boolean dup = false;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					dup = true;
				}
			}
			if(!dup){
				b[l]=a[i];
				l++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
