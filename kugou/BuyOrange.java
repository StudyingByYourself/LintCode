package examquestion;

import java.util.Scanner;

public class BuyOrange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(buyOrange(n));
		sc.close();
	}
	
	public static int buyOrange(int n) {
		if (n == 0) {
			return 0;
		}
		int[] f = new int[n + 1];
		int[] arr = {6, 8};
		f[0] = 0;
		for (int i = 1; i < f.length; i++) {
			f[i] = Integer.MAX_VALUE;
			for (int j = 0; j < arr.length; j++) {
				if (i >= arr[j] && f[i - arr[j]] != Integer.MAX_VALUE
						&& f[i - arr[j]] + 1 < f[i]) {
					f[i] = f[i - arr[j]] + 1;
				}
			}
		}
		if (f[n] == Integer.MAX_VALUE) {
			return -1;
		}
		return f[n];
	}
}
