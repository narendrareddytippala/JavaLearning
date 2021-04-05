package Third.JavaLearning.JavaLearning;

import java.util.ArrayList;

public class GetNegetiveNumberFirst {

	public static void main(String[] args) {
		int a[] = {-1,-20,30,40,50,-8};
//		int temp[]= new int[a.length];
//		int k=0;
//		for(int i: a){
//			if(i<0){
//				temp[k]=i;
//				k++;
//			}
//		}
//		for(int j:a){
//			if(j>0){
//				temp[k]=j;
//				k++;
//			}
//		}
//		for (int i : temp) {
//			System.out.println(i);
//		}
		ArrayList<Integer> ar = new ArrayList<>();
		for (Integer i : a) {
			if(i<0){ar.add(i);}
		}
		for (Integer j : a) {
			if(j>0){ar.add(j);}
		}
		System.out.println(ar);
	}
}
