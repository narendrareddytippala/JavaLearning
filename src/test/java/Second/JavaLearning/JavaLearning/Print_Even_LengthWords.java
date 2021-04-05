package Second.JavaLearning.JavaLearning;

import java.util.LinkedList;

public class Print_Even_LengthWords {

	public static void main(String[] args) {
		String a = "Hello java world lrn";
//		String[] len = a.split(" ");
//		for(int i = 0 ; i<len.length;i++){
//			if(len[i].length()%2==0){
//				System.out.println(len[i]+"--"+ len[i].length());
//			}
//			else if(len[i].length()%2!=0){
//				System.out.println(len[i]+"--"+ len[i].length());
//			}
//		}
		for(String b:a.split(" ")){
			if(b.length()%2==0){
				System.out.println(b+"--"+ b.length());
			}
			else if(b.length()%2!=0){
				System.out.println(b+"--"+ b.length());
		}
		}
	}

}
