package examquestion;

import java.util.Scanner;

public class WordAbbreviation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			wordAbbreviation(s);
		}
		sc.close();
	}
	public static void wordAbbreviation(String s) {
		int n = s.length();
		if (n < 10) {
			System.out.println(s);
			return;
		}
		String ret = "";
		ret += s.charAt(0);
		ret += n - 2;
		ret += s.charAt(n - 1);
		System.out.println(ret);
	}
}
