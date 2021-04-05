package Fourth.JavaLearning.JavaLearning.Strings;

import java.util.Stack;

public class ReverseStringByStack {

	public static void main(String[] args) {
		String name = "Hello World Java";
		Stack<Character> st = new Stack<>();
		for(char a:name.toCharArray()){
			if(a!=' '){
				st.add(a);
			}
			else{while(!st.isEmpty()){
				System.out.print(st.pop());
			}
			System.out.print(" ");
			}
		}
		while(!st.isEmpty()){
			System.out.print(st.pop());
			}
	}
}
