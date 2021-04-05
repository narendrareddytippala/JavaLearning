package Fourth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayList;
import java.util.Arrays;

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
		
//		al1.addAll(al2);
//		System.out.println(al1);
		al1.addAll(2, al2);
		System.out.println(al1);
		
		System.out.println(al1.indexOf("YYY")>0);
		
		ArrayList<String> al3 = new ArrayList<>(Arrays.asList("SSS","FFF","GGGG","FFF","JJJ"));
		System.out.println(al3);
		System.out.println(al3.indexOf("FFF"));
		System.out.println(al3.lastIndexOf("FFF"));
		
		ArrayList<String> al4 = new ArrayList<>(al3.subList(1, 4));
		System.out.println(al4);
		
		//Array to ArrayList
		String a[] = {"Tom","Harry","Peet"};
		System.out.println(Arrays.asList(a));
		
		//ArrayList to Array
		Object[] alp = al4.toArray();
		System.out.println(Arrays.toString(alp));
	}
}
