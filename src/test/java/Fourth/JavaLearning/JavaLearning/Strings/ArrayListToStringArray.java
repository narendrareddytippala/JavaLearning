package Fourth.JavaLearning.JavaLearning.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToStringArray {

	public static void main(String[] args) {
//		Array to ArrayList
		String a[]=new String[4];
		a[0]="AAA";
		a[1]="BBB";
		a[2]="CCC";
		a[3]="DDD";
		
		System.out.println(Arrays.asList(a));
		
//ArrayList to Array
		ArrayList<String> al = new ArrayList<>();
		al.add("SSS");
		al.add("RRR");
		al.add("TTT");
		al.add("NNN");
		
		String b[]= al.toArray(new String[al.size()]);
		System.out.println(b[2]);
	}
}
