package Third.JavaLearning.JavaLearning;

import org.omg.Messaging.SyncScopeHelper;

public class ReverseString_byRecursion {

	public static void main(String[] args) {
		String name="abcdef";
	    System.out.println(rever(name));

	}

	private static String rever(String name) {
		if(name==null||name.length()<=1){return name;}
		return rever(name.substring(1))+name.charAt(0);
	}

}
