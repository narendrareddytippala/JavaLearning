package Fifth.JavaLearning.JavaLearning.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncArrayList {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cal = new CopyOnWriteArrayList<>();
		cal.add("XXX");
		cal.add("YYY");
		cal.add("ZZZ");
		Iterator<String> it= cal.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		List<String>lt1= Collections.synchronizedList(Arrays.asList("AAA","BBB","CCC","DDD"));
		
		synchronized (lt1) {
			Iterator<String> it1= lt1.iterator();
			while(it1.hasNext()){
				System.out.println(it1.next());
			}
		}
		
		
		List<String> aaaa = Collections.synchronizedList(lt1);
	}
}
