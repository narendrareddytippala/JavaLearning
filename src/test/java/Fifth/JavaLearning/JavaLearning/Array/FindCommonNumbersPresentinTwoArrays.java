package Fifth.JavaLearning.JavaLearning.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonNumbersPresentinTwoArrays {

	public static void main(String[] args) {
		Integer a[] = {1,2,3,9,8,7};
		Integer b[] = {4,1,2,10,15};
		Integer c[] = {5,1,2,4,10};
		List<Integer> aa= Arrays.asList(a);
		List<Integer> bb= Arrays.asList(b);
		List<Integer> cc= Arrays.asList(c);
		Set<Integer> st = new HashSet<>();
		st.addAll(aa);
		st.addAll(bb);
		st.addAll(cc);
		Set<Integer> finalset = new HashSet<>();
		for(Integer i :st){
			if(aa.contains(i)&& bb.contains(i) || bb.contains(i)&& cc.contains(i) || cc.contains(i)&& aa.contains(i)){
				finalset.add(i);
			}
		}
		System.out.println(finalset);
	}
}
