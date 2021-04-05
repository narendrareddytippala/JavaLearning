package Fourth.JavaLearning.JavaLearning.Strings;

public class Panagram {

	public static void main(String[] args) {
		String s ="the quick brown fox jumps over the lazy dog";
		boolean status = true;
		for(char a ='a';a<'z';a++){
			if(s.indexOf(a)<0){
				status = false;
			}
		}
System.out.println("String is Panagram "+status);
	}

}
