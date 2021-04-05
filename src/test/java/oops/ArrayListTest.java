package oops;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {
	ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add("Tom");
		ar.add(true);
		ar.get(2);
		ar.set(1, "Harry");
		
		System.out.println(ar);
		
		ArrayList2 ar2 = new ArrayList2("AAA", 1, "aaa");
		ArrayList2 ar3 = new ArrayList2("BBB", 2, "bbb");
		ArrayList2 ar4 = new ArrayList2("CCC", 3, "ccc");
		
		ArrayList<ArrayList2> ar5 = new ArrayList<ArrayList2>();
		ar5.add(ar2);
		ar5.add(ar3);
		ar5.add(ar4);
		
		for(ArrayList2 a:ar5){
			System.out.print(a.name);
			System.out.print(a.age);
			System.out.print(a.dept);
			System.out.println("");
		}
		
		ArrayList a6 = new ArrayList();
		a6.add("A");
		a6.add("B");
		a6.add("C");
		ArrayList a7 = new ArrayList();
		a7.add("a");
		a7.add("b");
		a7.add("C");
		//a6.addAll(a7);
	//	System.out.println(a6);
		a6.retainAll(a7);
		System.out.println(a6);
	}
}
