package Fifth2.JavaLearning.JavaLearning.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonNumbersPresentinTwoArrays {

	public static void main(String[] args) {
		Integer a[] = {1,2,3,9,8,7};
		Integer b[] = {4,1,2,10,15};
		Integer c[] = {5,1,2,4,10};
		
		List<Integer> a1=Arrays.asList(a);
		List<Integer> b1=Arrays.asList(b);
		List<Integer> c1=Arrays.asList(c);
		Set<Integer> list = new HashSet<>();
		list.addAll(a1);
		list.addAll(b1);
		list.addAll(c1);
		ArrayList<Integer> finlist = new ArrayList<>();
		for(int abc: list){
			if(a1.contains(abc)&&b1.contains(abc)||c1.contains(abc)&&b1.contains(abc)||a1.contains(abc)&&c1.contains(abc)){
				finlist.add(abc);
			}
		}
		System.out.println(finlist);
	}
}
