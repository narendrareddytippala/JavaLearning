package Third.JavaLearning.JavaLearning;

import java.util.ArrayList;

public class CompareTwoArrarys {

	public static void main(String[] args) {
		int a[] = {2,4,6,7,9};
		int b[] ={1,4,6,8,9};
		ArrayList<Integer> al = new ArrayList<>();
		for(int i =0;i< a.length;i++){
			if(a[i]==b[i]){
				al.add(a[i]);
			}
		}
		System.out.println(al);
		Object[] oo= al.toArray();
		for (Object yy : oo) {
			System.out.println(yy);
		}
	}

}
