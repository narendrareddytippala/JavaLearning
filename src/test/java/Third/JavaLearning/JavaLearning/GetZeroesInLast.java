package Third.JavaLearning.JavaLearning;

import java.util.LinkedList;

public class GetZeroesInLast {

	public static void main(String[] args) {
		int a[] = { 10, 0, 0, 20, 40, 50, 60 };
		LinkedList<Integer> ll = new LinkedList<>();
		for (Integer i : a) {
			if(i>0){ll.add(i);}
		}
		for (Integer j : a) {
			if(j==0){ll.add(j);}
		}
		System.out.println(ll);
	}

}
