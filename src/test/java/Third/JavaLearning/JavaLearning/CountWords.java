package Third.JavaLearning.JavaLearning;

public class CountWords {

	public static void main(String[] args) {
		String name = "narendra to automation world";
		String[] a=name.trim().split(" ");
		System.out.println(a.length);

///////////	
		int count = 1;
		for (int i=0;i<name.length();i++) {
			if(name.charAt(i)==' ' && name.charAt(i+1)!=' '){
				count++;
			}
		}
		System.out.println(count);
	}

}
