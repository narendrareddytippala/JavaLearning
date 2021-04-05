package Fourth.JavaLearning.JavaLearning.Strings;

public class FirstCharToUpper {

	public static void main(String[] args) {
		String a = "this is javatpoint";
		String finlst="";
		for(String b:a.split(" ")){
			String first = b.substring(0,1).toUpperCase();
			String rem = b.substring(1).toLowerCase();
			finlst = finlst+first+rem+" ";
		}
		System.out.println(finlst);
	}
}
