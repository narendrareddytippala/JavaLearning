package Fifth.JavaLearning.JavaLearning.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		//Arrary to ArrayList
		String a[]=	{"AAA","DDD","EEE","BBB","CCC"};
		List<String> ll= Arrays.asList(a);
		System.out.println(ll);
		Collections.reverse(ll);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println(ll);
		
		//Arraylist to Array
		ArrayList<String> al = new ArrayList<>();
		al.add("aaa");
		al.add("ddd");
		al.add("eee");
		al.add("bbb");
		al.add("ccc");
		System.out.println(al);
		String b[]=al.toArray(new String [al.size()]);
		System.out.println(Arrays.toString(b));
	}

}
