package Fourth.JavaLearning.JavaLearning.Strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		String a = "this is javatpoint";
		System.out.println(a.length());
		String fin="";
		for(String b : a.split(" ")){
		StringBuilder sb = new StringBuilder(b);
		fin=fin+sb.reverse()+" ";
		}
		System.out.println(fin);
		System.out.println(fin.length());
		
		
		String finalrev="";
		for(String b : a.split(" ")){
			String rev="";
			for(int i=b.length()-1;i>=0;i--){
				rev=rev+b.charAt(i);
			}
			finalrev=finalrev+rev+" ";
		}
		System.out.println(finalrev);
	}
}
