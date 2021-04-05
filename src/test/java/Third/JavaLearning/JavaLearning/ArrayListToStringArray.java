package Third.JavaLearning.JavaLearning;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToStringArray {

	public static void main(String[] args) {
		
		String d[] = new String[3];
		d[0]="AAAA";
		d[1]="BBB";
		d[2]="CCC";

		
		System.out.println(Arrays.asList(d));
		
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Vizag");
		al.add("Blore");
		al.add("Hyd");
		al.add("Pune");
		
		String ad[] = al.toArray(new String[al.size()]);
		System.out.println(Arrays.toString(ad));
		
	}

}
