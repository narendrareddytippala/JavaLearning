package Fourth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncArrayList {

	public static void main(String[] args) {
		
	// Sync by collections	
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");

		synchronized (list) {
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
	// Sync by CopyOnWriteArrayList 	
		CopyOnWriteArrayList<String> cal= new CopyOnWriteArrayList<>();
		cal.add("XXX");
		cal.add("YYY");
		cal.add("ZZZ");
		Iterator<String> it= cal.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
