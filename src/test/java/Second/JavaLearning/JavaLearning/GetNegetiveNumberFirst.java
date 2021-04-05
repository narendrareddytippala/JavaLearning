package Second.JavaLearning.JavaLearning;

import java.util.LinkedList;

public class GetNegetiveNumberFirst {

	public static void main(String[] args) {
		int a[] = {-1,-20,30,40,50,-8};
		int temp[] = new int[a.length];
		LinkedList<Integer> ll = new LinkedList<Integer>();

		for(int i=0;i<a.length;i++){
			if(a[i]<0){
				ll.add(a[i]);
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				ll.add(a[i]);
			}
		}
		System.out.println(ll);
	}

}
