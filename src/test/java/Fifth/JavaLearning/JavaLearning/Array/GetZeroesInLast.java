package Fifth.JavaLearning.JavaLearning.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class GetZeroesInLast {

	public static void main(String[] args) {
		int a[] = { 10, 0, 0, 20, 40, 60, 50 };
		int b[] = new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				b[k]=a[i];
				k++;
			}
		}
		
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				b[k]=a[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(b));
		/////////////////////////////////////////////
		int aa[] = { 10, 0, 0, 20, 40, 60, 50 };
		ArrayList<Integer> al = new ArrayList<>();
		for(int i:aa){
			if(i==0){
				al.add(i);
			}
		}
		for(int i:aa){
			if(i>0){
				al.add(i);
			}
		}
		System.out.println(al);
		Collections.sort(al);  // To sort Asc
		System.out.println(al);
		Collections.reverse(al);// To reverse sequence
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder()); // To sort Desc
		System.out.println(al);
	}
}
