package examquestion;

import java.util.Scanner;

public class Sequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] f = new long[1000000 + 1];
		f[1] = 1;
		f[2] = 2;
		for (int i = 3; i < f.length; i++) {
			f[i] = (2 * f[i - 1] + f[i - 2]) % 32767;
		}
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			System.out.println(f[k]);
		}
		sc.close();
	}
}
