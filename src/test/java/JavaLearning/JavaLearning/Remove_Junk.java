package JavaLearning.JavaLearning;

public class Remove_Junk {

	public static void main(String[] args) {
		String name = "!@#$%^&*():{>? Java Learning &(&*{}";
		System.out.println(name.replaceAll("[^a-zA-Z0-1]", ""));

		String space = "I  am learning Java from scratch"; 
		System.out.println(space.replaceAll(" ", ""));
		

		
	}

}
