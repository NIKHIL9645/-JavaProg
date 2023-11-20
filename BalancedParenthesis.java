package DSA_2_0;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedParenthesis {
	
/*
		public static boolean areBracketsBalanced(String s)
		{
			int i = -1;
			char[] stack = new char[s.length()];
			for (char ch : s.toCharArray()) {
				if (ch == '(' || ch == '{' || ch == '[')
					stack[++i] = ch;
				else {
					if (i >= 0 && ((stack[i] == '(' && ch == ')')
							|| (stack[i] == '{' && ch == '}')
							|| (stack[i] == '[' && ch == ']')))
						i--;
					else
						return false;
				}
			}
			return i == -1;
		}

		public static void main(String[] args)
		{
			String expr = "{()}]";

			// Function call
			if (areBracketsBalanced(expr))
				System.out.println("Balanced");
			else
				System.out.println("Not Ba	lanced");
		}
	}
*/


	public static boolean isValid(String s) {
		Stack<Character> stack= new Stack<>();
		
		for (Character character : stack) {
			if(character=='(') {
				stack.push(')');
			}
			else if(character=='{'){
				stack.push('}');
			}
			else if(character=='[') {
				stack.push(']');
			}
			else if(stack.isEmpty() || stack.pop() !=character) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String str="([{}])";
		
		if(isValid(str)) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not balanced ");
		}
	
	}
	
}
//*/
