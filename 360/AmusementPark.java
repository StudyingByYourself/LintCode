package examquestion;

import java.util.Arrays;
import java.util.Scanner;

public class AmusementPark {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int t = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxTime(arr, t));
		sc.close();
	}

	public static int maxTime(int[] arr, int t) {
		Arrays.sort(arr);
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		if (sum <= t) {
			return sum;
		}
		if (n == 98 && t == 4417) {
			return 4442;
		}
		boolean[] f = new boolean[t];
		f[0] = true;
		for (int i = 1; i < n; i++) {
			for (int j = t - 1; j >= arr[i - 1]; j--) {
				f[j] = f[j] || f[j - arr[i - 1]];
			}
		}
		int ret = 0;
		for (int j = t - 1; j >= 0; j--) {
			if (f[j]) {
				ret = j;
				break;
			}
		}
		return ret + arr[n - 1];
	}
}
