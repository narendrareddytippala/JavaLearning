package Fifth2.JavaLearning.JavaLearning.Strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		String a = "this is javatpoint";
		String finword="";
		for(String b: a.split(" ")){
			String word="";
			for(int i=b.length()-1;i>=0;i--){
				word=word+b.charAt(i);
			}
			finword=finword+word+" ";
		}
		System.out.println(finword);
		
		
		String aa = "this is javatpoint";
		String wordb="";
		for(String ab:aa.split(" ")){
			StringBuilder sb = new StringBuilder(ab);
			wordb=wordb+sb.reverse()+" ";
		}
		System.out.println(wordb);
	}

}
