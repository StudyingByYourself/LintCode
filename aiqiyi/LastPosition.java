package examquestion;

import java.util.Scanner;

public class LastPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sum = sc.nextLong();
		lastPosition(sum);
		sc.close();
	}

	public static void lastPosition(long l) {
		int n = String.valueOf(l).length();
		String ret = "";
		for (int i = n; i >= 1; i--) {
			long digit = l / repeat(i);
			if (digit > 9) {
				System.out.println(-1);
				return;
			}
			ret += digit;
			l %= repeat(i);
		}
		System.out.println(ret);
	}

	private static long repeat(int n) {
		StringBuilder ret = new StringBuilder();
		for (int i = 0; i < n; i++) {
			ret.append("1");
		}
		return Long.valueOf(ret.toString());
	}
}
