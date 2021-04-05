package Third.JavaLearning.JavaLearning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Find_Duplicate_ElementsArrary {

	public static void main(String[] args) {
		String [] name ={"java","c++","python","java","net","cobol"};
		//Method 1:
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		for (String a : name) {
			mp.put(a, mp.containsKey(a)? mp.get(a)+1:1);
		}
		for (Entry<String, Integer> en : mp.entrySet()) {
			System.out.println(en.getKey()+"--"+en.getValue());
		}
		System.out.println("---------------------------------");
		//Method 2:
		Map<String, Integer> mp2 = new HashMap<String, Integer>();
		for (String a : name) {
			if(mp2.containsKey(a)){
				System.out.println("Have Duplicate of "+a);
			}
			else{mp2.put(a, 1);}
		}
		
		System.out.println("---------------------------------");
		//Method 3:
		Set<String> st = new HashSet<>();
		for (String a : name) {
			if(st.add(a)==false){System.out.println("Have Duplicate of "+a);}
		}
	}
}
