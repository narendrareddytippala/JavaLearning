package Second.JavaLearning.JavaLearning;

public class ReverseString {

	public static void main(String[] args) {
		String name = "narendra";
//Method 1:
//		String rev="";
//		for(int i=name.length()-1;i>=0;i--){
//			rev=rev+name.charAt(i);
//		}
//		System.out.println(rev);
//Method 2:
//		StringBuffer sb = new StringBuffer(name);
//		System.out.println(sb.reverse());
//Method 3:
		StringBuilder sbb = new StringBuilder(name);
		System.out.println(sbb.reverse());
	}

}
