package NewTest.checking.Strings;

public class FirstChatToUpper {

	public static void main(String[] args) {
		String a = "this is javatpoint";
		String fin ="";
		for(String b :a.split(" ")){
			String fir =b.substring(0,1).toUpperCase();
			String sec = b.substring(1);
			fin=fin+fir+sec+" ";
		}
		System.out.println(fin);
	}
}
