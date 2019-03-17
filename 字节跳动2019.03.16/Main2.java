package test;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];
		for (int i = 0; i < N; i++) {
			s[i] = sc.next();
		}
		for (int i = 0; i < N; i++) {
			s[i] = amend(s[i]);
			System.out.println(s[i]);
		}
		sc.close();
	}

	public static String amend(String str) {
		if (str.length() <= 2) {
			return str;
		}
		StringBuilder ret = new StringBuilder();
		ret.append(str.substring(0, 2));
		for (int i = 2; i < str.length(); i++) {
			int position = ret.length();
			if (str.charAt(i) == ret.charAt(position - 1) 
					&& str.charAt(i) == ret.charAt(position - 2)) {
				continue;
			}
			if (position > 2 && str.charAt(i) == ret.charAt(position - 1)
					&& ret.charAt(position - 2) == ret.charAt(position - 3)) {
				continue;
			}
			ret.append(str.charAt(i));
		}
		return ret.toString();
	}
}
