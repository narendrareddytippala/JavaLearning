package oops;

public class RemoveJunk_Special_Chars {

	public static void main(String[] args) {
		String s = "测试幸福的道路 this is java";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
