package examquestion;

import java.util.Scanner;

public class RedAndGreen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		coloring(s);
		sc.close();
	}
	
	public static void coloring(String s) {
		char[] c = s.toCharArray();
		int ret = c.length;
		for (int i = 0; i <= c.length; i++) {
			int temp = 0;
			for (int j = 0; j < i; j++) {
				if (c[j] == 'G') {
					temp++;
				}
			}
			for (int k = i; k < c.length; k++) {
				if (c[k] == 'R') {
					temp++;
				}
			}
			ret = Math.min(temp, ret);
		}
		System.out.println(ret);
	}
}
