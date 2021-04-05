package Third.JavaLearning.JavaLearning;

import java.util.Stack;

public class ReverseStringByStack {

	public static void main(String[] args) {
		String name = "Hello World Java";
		Stack<Character> st = new Stack<>();
		for (Character ch : name.toCharArray()) {
			if(ch!=' '){
			st.push(ch);
			}
			else{
				while(!st.empty()){
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}
		}
		
		while(!st.empty()){
			System.out.print(st.pop());
		}
	}

}
