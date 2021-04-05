package JavaLearning.JavaLearning;

public class Reverse_Each_Word {

	public static void main(String[] args) {
		String name = "Hello Java World";
		String reversetotal = "";
		String[] a= name.split(" ");
//		for(String w:a){
//			String reverseword = "";
//			for(int i=w.length()-1;i>=0;i--){
//				reverseword=reverseword+w.charAt(i);
//			}
//			reversetotal=reversetotal+reverseword+" ";
//		}
//		System.out.println(reversetotal);
		
//		for(int i=0;i<a.length;i++){
//			String reverseword = "";
//			for(int j=a[i].length()-1;j>=0;j--){
//				reverseword=reverseword+a[i].charAt(j);
//			}
//			reversetotal=reversetotal+reverseword+" ";
//		}
//		System.out.println(reversetotal);

		
		for(String b: name.split(" ")){
			String reverseword = "";
			for(int i = b.length()-1;i>=0;i--){
				reverseword=reverseword+b.charAt(i);
			}
			reversetotal=reversetotal+reverseword+" ";
		}
		System.out.println(reversetotal);
	}
}
