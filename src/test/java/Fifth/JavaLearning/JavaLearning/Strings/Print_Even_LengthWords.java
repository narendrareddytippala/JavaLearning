package Fifth.JavaLearning.JavaLearning.Strings;

public class Print_Even_LengthWords {

	public static void main(String[] args) {
		String a = "Hello java world learns";
		for(String aa: a.split(" ")){
			if(aa.length()%2==0){
				System.out.println(aa);
			}
		}

	}

}
