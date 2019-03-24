package examquestion;

import java.util.Scanner;
import java.util.Stack;

public class MissingBrackets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		minBrackets(s);
		sc.close();
	}
	
	public static void minBrackets(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (!stack.isEmpty()) {
				Character peek = stack.peek();
				if (peek == '(' && s.charAt(i) == ')') {
					stack.pop();
				} else {
					stack.push(s.charAt(i));
				}
			} else {
				stack.push(s.charAt(i));				
			}
		}
		System.out.println(stack.size());
	}
}
