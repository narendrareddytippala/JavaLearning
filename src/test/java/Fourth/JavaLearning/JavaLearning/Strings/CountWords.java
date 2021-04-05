package Fourth.JavaLearning.JavaLearning.Strings;

public class CountWords {

	public static void main(String[] args) {
		String name = "narendra to automation world";
		System.out.println(name.split(" ").length);
		int count=1;
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)==' '){
				count++;
			}
		}
		System.out.println(count);
	}
}
