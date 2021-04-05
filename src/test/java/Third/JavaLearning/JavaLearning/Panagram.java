package Third.JavaLearning.JavaLearning;

public class Panagram {

	public static void main(String[] args) {
		String s ="the quick brown fox jumps over the lazy dog";
		boolean status = true;
		if(s.length()<26){
			status = false;
		}
		else{
			for(char a= 'a'; a<='z';a++){
				System.out.println(s.indexOf(a));
				if(s.indexOf(a)<0){
					status = false;
				}
			}
		}
		System.out.println("Panagram "+status);
	}

}
