package Fifth2.JavaLearning.JavaLearning.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		String a[]= {"AAA","BBB","CCC","DDD"};
		List<String> ls= Arrays.asList(a);
		System.out.println(ls);
		
	ArrayList<String> al = new ArrayList<>(Arrays.asList("aaa","bbb","ccc","ddd"));
	String aal[] =al.toArray(new String[al.size()]);
	System.out.println(Arrays.asList(aal));
	}
}
