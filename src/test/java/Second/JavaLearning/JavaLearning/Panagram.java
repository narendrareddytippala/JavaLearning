package Second.JavaLearning.JavaLearning;

public class Panagram {

	public static void main(String[] args) {
		String s ="the quick brown fox jumps over the lazy dog";
		boolean status = true;
		if(s.length()<26){
			status=false;
		}
		else{
			for(char ch= 'a';ch<='z';ch++){
				System.out.println(s.indexOf(ch));
				if(s.indexOf(ch)<0){
					status=false;
				}
			}
		}
		System.out.println("Its Panagram "+status);
	}
}
