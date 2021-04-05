package oops;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("AAA");
		ll.add("BBB");
		ll.add("CCC");
		ll.add("EEE");
		ll.set(2, "DDD");
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		System.out.println("***********");
		for(int i = 0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		System.out.println("***********");
		for(String i: ll){
			System.out.println(i);
		}
		System.out.println("***********");
		Iterator<String>it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
