package Second.JavaLearning.JavaLearning;

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
		List<Integer> lt1 = Arrays.asList(a); 
		List<Integer> lt2 = Arrays.asList(b); 
		List<Integer> lt3 = Arrays.asList(c); 
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(lt1);
		hs.addAll(lt2);
		hs.addAll(lt3);
		List<Integer> finallist= new ArrayList<Integer>();
		for(Integer i:hs){
			if((lt1.contains(i)&&lt2.contains(i))||(lt2.contains(i)&&lt3.contains(i))||(lt1.contains(i)&&lt3.contains(i))){
				finallist.add(i);
			}
		}
		System.out.println(finallist);
	}

}
