package Fifth.JavaLearning.JavaLearning.Strings;

public class CharCountofSecondWord {

	public static void main(String[] args) {
		String name = "The best of both worlds";
		int num=4;
		int count =0;
		for(char a:name.split(" ")[num].toCharArray()){
			count++;
		}
		System.out.println(count);
	}
}
