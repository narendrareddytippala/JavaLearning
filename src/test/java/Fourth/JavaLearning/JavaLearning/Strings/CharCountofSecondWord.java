package Fourth.JavaLearning.JavaLearning.Strings;

public class CharCountofSecondWord {
	public static void main(String[] args) {
		String name = "The best of both worlds";
		int num=4;
		int count =0;
		String sep[] = name.split(" ");
		for(int i=0;i<sep[num].length();i++){
			count++;
		}
	System.out.println(count);
	}
}
