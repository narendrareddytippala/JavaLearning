package Fourth.JavaLearning.JavaLearning.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindCommonNumbersPresentinTwoArrays {

	public static void main(String[] args) {
		Integer a[] = {1,2,3,9,8,7};
		Integer b[] = {4,1,2,10,15};
		Integer c[] = {5,1,2,4,10};
		List<Integer> l1 = Arrays.asList(a);
		List<Integer> l2 = Arrays.asList(b);
		List<Integer> l3 = Arrays.asList(c);
		HashSet<Integer> hs = new HashSet<>();
		hs.addAll(l1);
		hs.addAll(l2);
		hs.addAll(l3);
		HashSet<Integer> finlist = new HashSet<>();
		for(int f :hs){
			if(l1.contains(f)&&l2.contains(f)||l2.contains(f)&&l3.contains(f)||l1.contains(f)&&l3.contains(f)){
				finlist.add(f);
			}
		}
		System.out.println(finlist);
	}
}
