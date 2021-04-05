package Fifth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequetest {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();
		dq.add("AAA");
		dq.add("BBB");
		dq.add("CCC");
		dq.add("DDD");
		dq.add("EEE");
		dq.addFirst("ZZZ");
		dq.add(" ");
		dq.add(" ");
//		dq.add(null);
		
		System.out.println(dq);
		System.out.println(dq.peek());
		System.out.println(dq.element());
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println("------");
		System.out.println(dq.pop());
		System.out.println(dq);
		System.out.println(dq.poll());
		System.out.println(dq);
		
		dq.add("ddd");
		dq.offer("ffff");
		System.out.println(dq);
		
		System.out.println(dq.remove());
		
		System.out.println(dq.poll());
		
		System.out.println(dq.element());
		
		System.out.println(dq.peek());

		System.out.println(dq);
	}
}
