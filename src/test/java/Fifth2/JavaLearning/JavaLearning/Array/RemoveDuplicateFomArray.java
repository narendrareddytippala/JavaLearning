package Fifth2.JavaLearning.JavaLearning.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFomArray {

	public static void main(String[] args) {
		int a[] = {10,20,20,30,30,40,50,50,20,10,30};  
		int b[] = new int[a.length];
		int temp=0;
		for(int i=0;i<a.length;i++){
			boolean status = false;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					status = true;
				}
			}
			if(!status){
				b[temp]=a[i];
				temp++;
			}
		}
		System.out.println(Arrays.toString(b));
		
		
		int aa[] = {10,20,20,30,30,40,50,50,20,10,30};  
		ArrayList<Integer> al = new ArrayList<>();
		for(int i: aa){
			if(!al.contains(i)){
				al.add(i);
			}
		}
		System.out.println(al);
	}
}
