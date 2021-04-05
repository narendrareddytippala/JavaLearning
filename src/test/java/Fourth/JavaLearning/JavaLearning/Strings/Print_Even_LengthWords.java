package Fourth.JavaLearning.JavaLearning.Strings;

public class Print_Even_LengthWords {

	public static void main(String[] args) {
		String a = "Hello java world learns";
		for(String b : a.split(" ")){
			if(b.length()%2==0){
				System.out.println(b);
			}
		}

	}

}
