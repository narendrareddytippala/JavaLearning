package Fifth2.JavaLearning.JavaLearning.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSubSetOfString {

	public static void main(String[] args) {
		String a = "CAT";
		int len = a.length();
		String b[]= new String[len*(len+1)/2]; 
		int temp=0;
		for(int i=0;i<len;i++){
			for(int j=i;j<len;j++){
			b[temp]=a.substring(i,j+1);
			temp++;
		}
		}
		System.out.println(Arrays.toString(b));
		
		String a1 = "CAT";
		ArrayList<String> al = new ArrayList<>();
		for(int i=0;i<a1.length();i++){
			for(int j=i;j<a1.length();j++){
				al.add(a1.substring(i,j+1));
			}
		}
		System.out.println(al);
	}
}
