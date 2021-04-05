package Fifth2.JavaLearning.JavaLearning.Strings;

public class CountWords {

	public static void main(String[] args) {
		String name = "narendra to automation world";
		int count =0;
		System.out.println(name.split(" ").length);
		System.out.println(name.split("\\s").length);
		for(String a: name.split(" ")){
			count++;
		}
		System.out.println(count);
	}
}
