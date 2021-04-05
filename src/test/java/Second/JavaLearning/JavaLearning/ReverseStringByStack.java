package Second.JavaLearning.JavaLearning;

import java.util.Stack;

public class ReverseStringByStack {

	public static void main(String[] args) {
		String name = "Hello World";
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)!=' '){
				st.push(name.charAt(i));
			}
			else {
				while(st.empty()==false){
					System.out.print(st.pop());
				}
				System.out.println(" ");
			}
		}
		while(st.empty()==false){
			System.out.print(st.pop());
		}
		System.out.println(" ");
		for(int i=name.length()-1;i>=0;i--){
			System.out.print(name.charAt(i));
		}
	}

}
