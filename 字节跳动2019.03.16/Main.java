package test;

import java.util.Scanner;

public class Main {
	public static int minCoin(int[] arr, int target) {
		int n = arr.length;
		if (n == 0) {
			return 0;
		}
		int[] f = new int[target + 1];
		f[0] = 0;
		for (int i = 1; i < f.length; i++) {
			f[i] = Integer.MAX_VALUE;
			for (int j = 0; j < arr.length; j++) {
				if (i - arr[j] >= 0 && f[i - arr[j]] != Integer.MAX_VALUE 
						&& f[i - arr[j]] + 1 < f[i]) {
					f[i] = f[i - arr[j]] + 1;
				}
			}
		}
		if (f[target] == Integer.MAX_VALUE) {
			return -1;
		}
		return f[target];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 16, 64 };
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int minCoins = minCoin(arr, 1024 - N);
		System.out.println(minCoins);
		sc.close();
	}
}
