package examquestion;

import java.util.Scanner;

public class Decode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(decode(s));
		sc.close();
	}

	public static int decode(String s) {
		int n = s.length();
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return s.equals("0") ? 0 : 1;
		}
		int[] f = new int[n + 1];
		f[0] = f[1] = 1;
		for (int i = 2; i < f.length; i++) {
			if (s.charAt(i - 1) != '0') {
				f[i] += f[i - 1];
			}
			int number = Integer.valueOf(s.substring(i - 2, i));
			if (number >= 10 && number <= 26) {
				f[i] += f[i - 2];
			}
		}
		return f[n];
	}
}
