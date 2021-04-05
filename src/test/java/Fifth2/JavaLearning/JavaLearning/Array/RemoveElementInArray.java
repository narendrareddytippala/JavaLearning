package Fifth2.JavaLearning.JavaLearning.Array;

import java.util.ArrayList;

public class RemoveElementInArray {

	public static void main(String[] args) {
		int a[]=  {1,2,3,4,5};
		int rem=3;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i =0;i<a.length;i++){
			if(i!=rem){
				al.add(a[i]);
			}
		}
		System.out.println(al);
	}

}
