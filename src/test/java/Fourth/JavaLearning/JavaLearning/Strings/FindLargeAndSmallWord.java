package Fourth.JavaLearning.JavaLearning.Strings;

public class FindLargeAndSmallWord {

	public static void main(String[] args) {
		String str="Hardships often prepare ordinary people for an extraordinary destiny";
		
		int min=str.split(" ")[0].length();
		int max=str.split(" ")[0].length();
		String maxstr="";
		String minstr="";
		for(String a: str.split(" ")){
			int count=0;
			for(int i=0;i<a.length();i++){
				count++;
			}
			if(count>=max){
				max=a.length();
				maxstr=a;
			}
			if(count<=min){
				min=a.length();
				minstr=a;
			}
		}
		System.out.println(maxstr);
		System.out.println(minstr);
	}
}
