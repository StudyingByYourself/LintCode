package examquestion;

import java.util.Arrays;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
		numberGame(s);
		sc.close();
	}
	
	public static void numberGame(String[] s) {
		int ret = 0;
		for (int i = 0; i < s.length; i++) {
			char[] c = s[i].toCharArray();
			Arrays.sort(c);
			int temp = 0;
			for (int j = 0; j < c.length; j++) {
				temp = temp * 10 + (c[j] - '0');
			}
			ret = Math.max(ret, temp);
		}
		System.out.println(ret);
	}
}
