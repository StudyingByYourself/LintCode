package examquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QiaoQiaoBag {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v = sc.nextInt();
		int[] m = new int[n];
		int[] w = new int[n];
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
			w[i] = sc.nextInt();
			s[i] = sc.nextInt();
		}
		List<Integer> listW = new ArrayList<>();
		List<Integer> listS = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			while (m[i] != 0) {
				listW.add(w[i]);
				listS.add(s[i]);
				m[i]--;
			}
		}
		System.out.println(maxValue(listW, listS, v));
		sc.close();
	}

	public static int maxValue(List<Integer> listW, List<Integer> listS, int v) {
		int m = listW.size();
		int[][] f = new int[m + 1][v + 1];
		f[0][0] = 0;
		for (int j = 0; j < v + 1; j++) {
			f[0][j] = -1;
		}
		for (int i = 1; i < f.length; i++) {
			f[i][0] = 0;
			for (int j = 1; j < f[0].length; j++) {
				if (f[i - 1][j] != -1) {
					f[i][j] = f[i - 1][j];
				}
				if (j - listW.get(i - 1) >= 0 && f[i - 1][j - listW.get(i - 1)] != -1) {
					f[i][j] = Math.max(f[i][j], f[i - 1][j - listW.get(i - 1)] + listS.get(i - 1));
				}
			}
		}
		int ret = 0;
		for (int j = 0; j < v + 1; j++) {
			ret = Math.max(ret, f[m][j]);
		}
		return ret;
	}
}
