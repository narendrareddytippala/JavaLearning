package Fourth.JavaLearning.JavaLearning.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GetNegetiveNumberFirst {

	public static void main(String[] args) {
		int a[] = {-1,-20,30,50,40,-8};
		int b[] = new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<0){
			b[k]=a[i];	
			k++;
			}
		}
		for(int j=0;j<a.length;j++){
			if(a[j]>0){
			b[k]=a[j];	
			k++;
			}
		}
		System.out.println(Arrays.toString(b));
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int aa:a){
			if(aa<0){al.add(aa);}
		}
		for(int aa:a){
			if(aa>0){al.add(aa);}
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
