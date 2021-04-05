package Fifth2.JavaLearning.JavaLearning.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GetNegetiveNumberFirst {

	public static void main(String[] args) {
		int a[] = {-1,-20,30,50,40,-8};
		ArrayList<Integer> al = new ArrayList<>();
		for(int i :a){
			if(i<0)
			al.add(i);	
		}
		for(int i :a){
			if(i>0)
			al.add(i);	
		}
		System.out.println(al);
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}

}
