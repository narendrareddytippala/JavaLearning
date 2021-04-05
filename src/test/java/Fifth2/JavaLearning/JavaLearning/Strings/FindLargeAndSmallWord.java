package Fifth2.JavaLearning.JavaLearning.Strings;

public class FindLargeAndSmallWord {

	public static void main(String[] args) {
		String str="Hardships often prepare ordinary people for an extraordinary destiny";
		int max = str.split(" ")[0].length();
		int min = str.split(" ")[0].length();
		String maxword="", minword="";
		for(String a:str.split(" ")){
			if(a.length()>max){
				max=a.length();
				maxword=a;
			}
			if(a.length()<min){
				min=a.length();
				minword=a;
			}
		}
		System.out.println("Max is word "+maxword+" with chars "+max);
		System.out.println("Min is word "+minword+" with chars "+min);
	}
}
