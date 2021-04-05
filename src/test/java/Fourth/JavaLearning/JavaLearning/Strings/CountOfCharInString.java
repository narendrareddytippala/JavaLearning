package Fourth.JavaLearning.JavaLearning.Strings;

public class CountOfCharInString {

	public static void main(String[] args) {
		String name = "The best of both worlds";
		int count =0;
		for(char a : name.toCharArray()){
			if(a!=' ')
			count++;	
		}
		System.out.println(count);
		
//		for(int i=0;i<name.length();i++){
//			if(name.charAt(i)!=' '){
//				
//			}
//		}
	}

}
