package NewTest.checking.Strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		String a = "this is javatpoint";
		String finrev="";
		for(String b:a.split(" ")){
			String rev="";
			for(int i=b.length()-1;i>=0;i--){
				rev=rev+b.charAt(i);
			}
			finrev=finrev+rev+" ";
		}
		System.out.println(finrev);
	}

}
