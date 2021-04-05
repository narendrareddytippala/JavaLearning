package Second.JavaLearning.JavaLearning;

public class Reverse_Each_Word {

	public static void main(String[] args) {
		String name = "Hello jave world";
		String revfinal="";
		String revfinal1="";
		String [] a = name.split(" ");
		
		for(int i=0;i<a.length;i++){
			String revword="";
			for(int j=a[i].length()-1;j>=0;j--){
				revword=revword+a[i].charAt(j);
			}
			revfinal=revfinal+revword+" ";
		}
		System.out.println(revfinal);
		
		
		for(String b:name.split(" ")){
			String rev1 ="";
			for(int i=b.length()-1;i>=0;i--){
				rev1=rev1+b.charAt(i);
			}
			revfinal1=revfinal1+rev1+" ";
		}
		System.out.println(revfinal1);
	}
}
