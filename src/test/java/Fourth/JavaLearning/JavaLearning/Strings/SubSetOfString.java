package Fourth.JavaLearning.JavaLearning.Strings;

import java.util.Arrays;

public class SubSetOfString {

	public static void main(String[] args) {
		String str = "CAT";
		int len = str.length();
		int temp =0;
		String sub[] = new String[len*(len+1)/2];
		for(int i=0;i<len;i++){
			for(int j=i;j<len;j++){
				sub[temp]=str.substring(i,j+1);
				temp++;
			}
		}
		System.out.println(Arrays.toString(sub));
	}
}
