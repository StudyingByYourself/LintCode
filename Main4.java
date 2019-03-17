package test;

import java.util.Scanner;

// 匹配单词:在一串字符串中找到指定单词出现的个数
public class Main4 {
	public static int match(String s, String t) {
		if (s.length() < t.length()) {
			return 0;
		}
		int ret = 0;
		for (int i = t.length(); i < s.length(); i++) {
			if (s.substring(i - t.length(), i).equals(t)) {
				ret++;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println("The string has " + match(s, t) + " number of " + t);
		sc.close();
	}
}
