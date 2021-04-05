package Fourth.JavaLearning.JavaLearning.Array;

import java.util.ArrayList;
import java.util.Collections;

public class GetZeroesInLast {

	public static void main(String[] args) {
		int a[] = { 10, 0, 0, 20, 40, 60, 50 };
		ArrayList<Integer> al = new ArrayList<>();
		for(int aa:a)
		if(aa>0){al.add(aa);}
		for(int aa:a)
			if(aa==0){al.add(aa);}
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
//		Collections.reverse(al);
//		System.out.println(al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}

}
