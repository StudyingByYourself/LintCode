package examquestion;

import java.util.Scanner;

public class Airtravel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ret = 0;
		for (int i = 0; i < arr.length; i++) {
			if (s >= arr[i]) {
				ret++;
				s -= arr[i];
			} else {
				break;
			}
		}
		System.out.println(ret);
		sc.close();
	}
}
