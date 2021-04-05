package Second.JavaLearning.JavaLearning;

public class CountWords {

	public static void main(String[] args) {
		String name = "Hello Java World";
		int count =0;
//		for(int i=0;i<name.length();i++){
//			if((name.charAt(i)==' ')&&(name.charAt(i+1)!=' ')){
//				count++;
//			}
//		}
		for(String a:name.split(" ")){
			count++;
		}
		System.out.println(count);
		
	}
}
