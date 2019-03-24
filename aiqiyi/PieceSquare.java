package examquestion;

import java.util.Arrays;
import java.util.Scanner;

public class PieceSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		square(a, b, c, d);
		sc.close();
	}

	private static void square(int a, int b, int c, int d) {
		int[] arr = {a, b, c, d};
		Arrays.sort(arr);
		int ret = Integer.MAX_VALUE;
		for (int i = arr[1]; i <= arr[2]; i++) {
			int temp = 0;
			for (int j = 0; j < arr.length; j++) {
				temp += Math.abs(arr[j] - i);
			}
			if (temp < ret) {
				ret = temp;
			}
		}
		System.out.println(ret);
	}
	
}
