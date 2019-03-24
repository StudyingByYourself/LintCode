package examquestion;

import java.util.Scanner;

public class GrassGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		boolean[] b = new boolean[t];
		for (int i = 0; i < b.length; i++) {
			b[i] = winOrLose(sc.nextInt());
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i]) {
				System.out.println("niu");
			} else {
				System.out.println("yang");
			}
		}
		sc.close();
	}
	
	// 会超时
	public static boolean winOrLose(int n) {
		boolean[] f = new boolean[(n + 1)];
		f[0] = false;
		for (int i = 1; i < f.length; i++) {
			f[i] = false;
			for (int j = 0; Math.pow(4, j) <= i; j++) {
				if (!f[i - (int)Math.pow(4, j)]) {
					f[i] = true;
					break;
				}
			}
		}
		return f[n];
	}
}
