package Fifth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListLearn {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>(30); // Default virtual capacity is 10, also can declare like 30
		al1.add("AAA");
		al1.add("BBB");
		al1.add("CCC");
		al1.add("DDD");
		al1.add("EEE");
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("XXX");
		al2.add("YYY");
		
		//combine two AL's
		al1.addAll(al2);
		System.out.println(al1);
		
		System.out.println(al1.indexOf("DDD")>0);
		
		
		ArrayList<String> al3 = new ArrayList<>(Arrays.asList("AAA","BBB","CCC","DDD","EEE"));
		
		ArrayList<String> al4 = new ArrayList<>();
		al4.add("AAA");
		al4.add("BBB");
		al4.add("CCC");
		al4.add("EEE");
		al4.add("DDD");
		System.out.println(al3.equals(al4));
		Collections.sort(al3);
		Collections.sort(al4);
		System.out.println(al3.equals(al4));
		
		ArrayList<String> al5 = new ArrayList<>(al3.subList(1, 4));
		System.out.println(al5);
		
		
		
	}
}
