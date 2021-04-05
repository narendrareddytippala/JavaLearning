package Fourth.JavaLearning.JavaLearning.Strings;

import java.util.Arrays;

public class FindSubSetOfString {

	public static void main(String[] args) {
		String a = "CAT";
		int len =a.length();
		int temp=0;
		String b[] =new String[len*(len+1)/2];
		for(int i=0;i<len;i++){
			for(int j=i;j<len;j++){
				b[temp]=a.substring(i,j+1);
				temp++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
