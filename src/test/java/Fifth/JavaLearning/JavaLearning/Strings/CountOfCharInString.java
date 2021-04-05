package Fifth.JavaLearning.JavaLearning.Strings;

public class CountOfCharInString {

	public static void main(String[] args) {
		String name = "The best of both worlds";
		int countwithspace =0;
		int countnospace =0;
		for(char a: name.toCharArray()){
			countwithspace++;
			if(a!=' ')
				countnospace++;
		}
		System.out.println(countwithspace);
		System.out.println(countnospace);
	}

}
