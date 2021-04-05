package Second.JavaLearning.JavaLearning;

import java.util.ArrayList;
import java.util.LinkedList;

public class GetZeroesInLast {

	public static void main(String[] args) {
		int a[] = { 10, 0, 0, 20, 40, 50, 60 };
		LinkedList<Integer> ll = new LinkedList<Integer>();
		int k =0;
		for(int i = 0;i<a.length;i++){
			if(a[i]!=0){
				ll.add(a[i]);
			}
		}
		for(int j = 0;j<a.length;j++){
			if(a[j]==0){
				ll.add(a[j]);
			}
		}
		System.out.println(ll);
	}

}
