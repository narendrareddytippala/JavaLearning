package Third.JavaLearning.JavaLearning;

public class Print_Even_LengthWords {

	public static void main(String[] args) {
		String a = "Hello java world lrn";
		String b[]=a.split(" ");
		for(String c:a.split(" ")){
			//if(c.length()%2==0){
				System.out.println(c+"--"+c.length());
			//}
		}

	}

}
