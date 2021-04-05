package NewTest.checking.Strings;

public class FindLargeAndSmallWord {

	public static void main(String[] args) {
		String str="Hardships often prepare ordinary people for an extraordinary destiny";
		int min = str.split(" ")[0].length();
		int max = str.split(" ")[0].length();
		String minstr="",maxstr="";
		for(String a :str.split(" ")){
			if(a.length()>max){
				max=a.length();
				maxstr=a;
			}
			if(a.length()<min){
				min=a.length();
				minstr=a;
			}
		}
		System.out.println("Min word is: "+minstr+"--"+min);
		System.out.println("Max word is: "+maxstr+"--"+max);
	}
}
