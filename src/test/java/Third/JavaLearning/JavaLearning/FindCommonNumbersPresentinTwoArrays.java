package Third.JavaLearning.JavaLearning;

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
		List<Integer> l1 = Arrays.asList(a);
		List<Integer> l2 = Arrays.asList(b);
		List<Integer> l3 = Arrays.asList(c);
		Set<Integer> st = new HashSet<>();
		st.addAll(l1);
		st.addAll(l2);
		st.addAll(l3);
		Set<Integer> finalset = new HashSet<>();
		for (Integer i : st) {
			if(l1.contains(i)&&l2.contains(i)||l2.contains(i)&&l3.contains(i)||l1.contains(i)&&l3.contains(i)){
				finalset.add(i);
			}
		}
		System.out.println(finalset);
	}
}
