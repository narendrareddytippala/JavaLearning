package Third.JavaLearning.JavaLearning;

public class Reverse_Each_Word {

	public static void main(String[] args) {
		String name = "Hello java world";
		String finalrev="";
		for(String a:name.split(" ")){
			String rev = "";
			for(int i = a.length()-1;i>=0;i--){
				rev= rev+a.charAt(i);
			}
			finalrev=finalrev+rev+" ";
		}
		System.out.println(finalrev);
	}
}