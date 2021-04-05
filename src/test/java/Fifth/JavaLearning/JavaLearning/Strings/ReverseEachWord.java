package Fifth.JavaLearning.JavaLearning.Strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		String a = "this is javatpoint";
		
		String finrevword="";
		for(String aa:a.split(" ")){
			String revword="";
			for(int i=aa.length()-1;i>=0;i--){
				revword=revword+aa.charAt(i);
			}
			finrevword=finrevword+revword+" ";
		}
		System.out.println(finrevword);
		
		String revword1="";
		for(String b:a.split(" ")){
			StringBuilder sbb= new StringBuilder(b);
			revword1=revword1+sbb.reverse()+" ";
		}	
		System.out.println(revword1);
	}
}
