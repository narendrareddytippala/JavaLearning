package Fourth.JavaLearning.JavaLearning.Strings;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("AAAA");
		al.add("BBBB");
		al.add("CCCC");
		al.add("DDDD");
		al.add("EEEE");
		System.out.println(al.get(2));

		LinkedList<String> ll = new LinkedList<>();
		ll.add("AAAA");
		ll.add("BBBB");
		ll.add("CCCC");
		ll.add("DDDD");
		ll.add("EEEE");
		System.out.println(ll.get(3));
	}
}
