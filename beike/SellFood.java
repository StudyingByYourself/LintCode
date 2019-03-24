package examquestion;

import java.util.Scanner;

public class SellFood {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxSnack(arr));
		sc.close();
	}
	
	public static int maxSnack(int[] arr) {
		int n = arr.length;
		if (n == 0) {
			return 0;
		}
		int[][] f = new int[n][n];
		for (int i = 0; i < n; i++) {
			f[i][i] = arr[i] * n;
		}
		int len;
		for (len = 2; len <= n; len++) {
			for (int i = 0; i <= n - len; i++) {
				int j = i + len - 1;
				f[i][j] = f[i][j - 1] + arr[j] * (n - len + 1);
				f[i][j] = Math.max(f[i][j], f[i + 1][j] + arr[i] * (n - len + 1));
			}
		}
		return f[0][n - 1];
	}
}
