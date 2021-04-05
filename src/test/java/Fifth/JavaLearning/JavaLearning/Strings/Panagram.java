package Fifth.JavaLearning.JavaLearning.Strings;

public class Panagram {

	public static void main(String[] args) {
		String s ="the quick brown fox jumps over the lazy dog";
		boolean status = true;
		for(char i= 'a';i<='z';i++){
			if(s.indexOf(i)<0){
				status = false;
			}
		}
		if(status)
			System.out.println("String is Panagram");
		else
			System.out.println("String is not Panagram");
	}
}
