package examquestion;

import java.util.Scanner;

public class NumberStrng {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(minNumber(s));
		sc.close();
	}

	public static int minNumber(String s) {
		int[] f = new int[10];
		for (int i = 0; i < s.length(); i++) {
			f[s.charAt(i) - '0']++;
		}
		for (int i = 1; i < 100000; i++) {
			int[] t = new int[10];
			char[] str = String.valueOf(i).toCharArray();
			for (int j = 0; j < str.length; j++) {
				t[str[j] - '0']++;
			}
			for (int k = 0; k < 10; k++) {
				if (t[k] > f[k]) {
					return i;
				}
			}
		}
		return -1;
	}
}
