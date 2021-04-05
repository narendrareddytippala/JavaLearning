package Second.JavaLearning.JavaLearning;

import java.util.Stack;

public class Reverse_Number_InArray {

	public static void main(String[] args) {
		int a[] = {5,6,7,8};
//		for(int i=a.length-1;i>=0;i--){
//			System.out.println(a[i]);
//		}
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<a.length;i++){
			st.push(a[i]);
			//System.out.println(st);
		}
		while(!st.empty()){
			System.out.println(st.pop());
		}
		
		System.out.println("*****");
		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i]);
		}
		
	}

}
