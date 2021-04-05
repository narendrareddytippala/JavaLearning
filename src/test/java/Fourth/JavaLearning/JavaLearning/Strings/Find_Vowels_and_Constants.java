package Fourth.JavaLearning.JavaLearning.Strings;

public class Find_Vowels_and_Constants {

	public static void main(String[] args) {
		String name = "nare ndra";
		int vow=0,cont=0;
		for(char a:name.toLowerCase().toCharArray()){
			if(getstatus(a)){
				vow++;}
			else if(a!=' '){
				cont++;
			};
		}
		System.out.println("Vowels are: "+vow);
		System.out.println("Consta are: "+cont);
	}
	public static boolean getstatus(char a){
		return (a=='a'||a=='e'||a=='i'||a=='o'||a=='u');
	}
}
