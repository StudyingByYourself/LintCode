package examquestion;

import java.util.Arrays;
import java.util.Scanner;

public class ChildrenDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] w = new int[m];
		for (int i = 0; i < w.length; i++) {
			w[i] = sc.nextInt();
		}
		int ret = maxChildren(h, w);
		System.out.println(ret);
		sc.close();
	}

	// while写法
	public static int maxChildren(int[] h, int[] w) {
		Arrays.sort(h);
		Arrays.sort(w);
		int ret = 0;
		int i = 0;
		int j = 0;
		while (j < w.length && i < h.length) {
			if (w[j] >= h[i]) {
				ret++;
				j++;
				i++;
			} else {
				j++;
			}
		}
		return ret;
	}

	// for写法
	public static int maxChildren2(int[] h, int[] w) {
		Arrays.sort(h);
		Arrays.sort(w);
		int ret = 0;
		for (int i = 0, j = 0; i < h.length && j < w.length; j++) {
			if (w[j] >= h[i]) {
				ret++;
				i++;
			}
		}
		return ret;
	}
}
