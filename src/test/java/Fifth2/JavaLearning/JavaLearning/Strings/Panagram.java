package Fifth2.JavaLearning.JavaLearning.Strings;

public class Panagram {

	public static void main(String[] args) {
		String s ="the quick brown fox jumps over the lazy dog";
		boolean status = false;
		for(char ch='a';ch<='z';ch++){
			if(s.indexOf(ch)<0){
				status = true;
			}
		}
		if(!status){
			System.out.println("Its Panagram");
		}
	}

}
