package Fifth.JavaLearning.JavaLearning.Collections;

import java.util.Vector;

public class Vectortest {

	public static void main(String[] args) {
		Vector <String> vc = new Vector<>();
		System.out.println(vc.capacity());
		vc.add("AAA");
		vc.add("BBB");
		vc.add("CCC");
		vc.add("DDD");
		System.out.println(vc.elementAt(2));
		System.out.println(vc.firstElement());
		System.out.println(vc.lastElement());
		System.out.println(vc.capacity());

	}

}
