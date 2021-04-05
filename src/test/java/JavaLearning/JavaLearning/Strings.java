package JavaLearning.JavaLearning;

public class Strings {

	public static void main(String[] args) {
		
		String name = "LearingJava";
		System.out.println(name.charAt(3));
		System.out.println(name.contains("g"));
		System.out.println(name.indexOf("J"));
		System.out.println(name.length());
		System.out.println(name.substring(2, 6));
		String arr[]=name.split("g");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(name.concat(":today"));
	}

}
