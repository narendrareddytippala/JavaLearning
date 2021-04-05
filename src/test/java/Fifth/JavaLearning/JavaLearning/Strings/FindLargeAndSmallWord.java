package Fifth.JavaLearning.JavaLearning.Strings;

public class FindLargeAndSmallWord {

	public static void main(String[] args) {
		String str="Hardships often prepare ordinary people for an extraordinary destiny";
		int min = str.split(" ")[0].length();
		int max = str.split(" ")[0].length();
		String minword="",maxword ="";
		for(String a : str.split(" ")){
			if(a.length()>=max){
				max = a.length();
				maxword=a;
			}
			if(a.length()<=min){
				min = a.length();
				minword=a;
			}
		}
		System.out.println("Max word is "+maxword+"--"+max);
		System.out.println("Min word is "+minword+"--"+min);
	}
}
