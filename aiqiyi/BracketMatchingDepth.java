package examquestion;

import java.util.Scanner;
import java.util.Stack;

public class BracketMatchingDepth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		bracketMatchingDepth(s);
		sc.close();
	}
	
	public static void bracketMatchingDepth(String s) {
		int ret = 0;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				stack.add(c);
				ret = Math.max(ret, stack.size());
			} else {
				stack.pop();
			}
		}
		System.out.println(ret);
	}
}
