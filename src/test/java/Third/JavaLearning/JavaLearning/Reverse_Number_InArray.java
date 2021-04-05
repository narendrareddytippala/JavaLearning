package Third.JavaLearning.JavaLearning;

import java.util.ArrayList;
import java.util.Stack;

public class Reverse_Number_InArray {

	public static void main(String[] args) {
		int a[] = {5,6,7,8};
		for(int i = a.length-1;i>=0;i--)
		{System.out.println(a[i]);}
		
		System.out.println("---------------");
		Stack<Integer> st = new Stack<>();
		for(int i: a){
		st.push(i);
		}
		while(!st.empty()){
			System.out.println(st.pop());
		}
		
		
		String aa= "Hello java";
		Stack<Character> st1 = new Stack<>();
		for(char ch:aa.toCharArray()){
			st1.push(ch);
		}
		while(!st1.empty()){
			System.out.print(st1.pop());
		}
		System.out.println();
		String bb= "Hello java";
		ArrayList<Character> al = new ArrayList<>();
		for(char cc: bb.toCharArray()){
			al.add(cc);
		}
		for(int i=al.size()-1;i>=0;i--){
			System.out.print(al.get(i));
		}
		
	}

}
