package Fifth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("AAA");
		pq.add("BBB");
		pq.add("CCC");
		pq.add("DDD");
		pq.add("EEE");
		pq.add(" ");
		pq.add("EEE");
		pq.add(" ");
//		pq.add(null);
		System.out.println(pq);
		
	}
}
