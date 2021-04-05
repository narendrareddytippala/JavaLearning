package Fifth.JavaLearning.JavaLearning.Strings;

public class CountWords {

	public static void main(String[] args) {
		String name = "narendra to automation world";
		System.out.println(name.split(" ").length);
		int count=0;
		for(String a: name.split(" ")){
			count++;
		}
		System.out.println(count);
	}

}
