package Fifth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.Vector;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.add("AAA");
		st.add("BBB");
		st.add("CCC");
		st.add("DDD");
		st.add("EEE");
		st.add(" ");
		st.add(" ");
		st.add("null");
		
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.empty());
		System.out.println(st.search("DDD"));
		System.out.println(st.elementAt(3));
		System.out.println("------");
		
		Stack<String> stk= new Stack<>();  
		//pushing elements into Stack  
		stk.push("Mac Book");  
		stk.push("HP");  
		stk.push("DELL");  
		stk.push("Asus");  
		System.out.println("Stack: " + stk);  
		// Search an element  
		int location = stk.search("HP");  
		System.out.println("Location of Dell: " + location);  
		
		
		System.out.println("------");
		Vector<String> vc = new Vector<>();
		vc.add("AAAa");
		vc.add("BBBb");
		vc.add("CCCc");
		vc.add("DDDd");
		vc.add("EEEe");
		System.out.println(vc);
        String str = vc.toString();  
        System.out.println(str);

	}
}
//[ZZZ, AAA, BBB, CCC, DDD, EEE]
//ZZZ
//ZZZ
//ZZZ
//EEE
//------
//ZZZ
//[AAA, BBB, CCC, DDD, EEE]
//AAA
//[BBB, CCC, DDD, EEE]