package JavaLearning.JavaLearning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[]={1,2,3,4,5};
		boolean status=true;
		//System.out.println(Arrays.equals(a, b));
		if(a.length==b.length){
			for(int i=0;i<a.length;i++){
				if(a[i]!=b[i]){
					status = false;
				}
			}
		}else
		status = true;
		if(status == true){System.out.println("Arrary matched");}else{System.out.println("Arrays mismatch");}
	}

}
