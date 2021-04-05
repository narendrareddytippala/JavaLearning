package Fourth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6,7,5,8,9,10,11,10,12));
		HashSet<Integer> hs = new HashSet<>(al);  // convert to set
		System.out.println(hs);
		
		ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6,7,5,8,9,10,11,10,12));
		List<Integer> ll=al1.stream().distinct().collect(Collectors.toList()); // using stream
		System.out.println(ll);
		
		//Compare to arraylists 
		ArrayList<String> al2 = new ArrayList<>(Arrays.asList("a","c","b","d","e"));
		ArrayList<String> al3 = new ArrayList<>(Arrays.asList("b","a","c","e","d"));
		System.out.println(al2.equals(al3));
		Collections.sort(al2);
		Collections.sort(al3);
		System.out.println(al2.equals(al3));
		
		//Find out additional element
		ArrayList<String> al4 = new ArrayList<>(Arrays.asList("a","c","b","d","f"));
		ArrayList<String> al5 = new ArrayList<>(Arrays.asList("b","a","c","e","d"));
//		al4.removeAll(al5);
//		System.out.println(al4);
		
		//Find common elements
		al4.retainAll(al5);
		System.out.println(al4);
	}
}
