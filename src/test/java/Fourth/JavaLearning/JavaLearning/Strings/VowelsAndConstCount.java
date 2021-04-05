package Fourth.JavaLearning.JavaLearning.Strings;

public class VowelsAndConstCount {

	public static void main(String[] args) {
		String name = "This is a really simple sentence";
		int vow =0; int cont =0;
		for(char a : name.toLowerCase().toCharArray()){
			if(a=='a'||a=='e'|a=='i'|a=='o'|a=='u'){
				vow++;
			}
			else if(a!=' '){
				cont++;
			}
		}
		System.out.println("Vowels are: "+vow);
		System.out.println("Vowels are: "+cont);
	}
}
