package examquestion;

import java.util.Scanner;

public class SequenceExpression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sequence(arr);
		sc.close();
	}
	
	public static void sequence(int[] arr) {
		int ret = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] + 1 != arr[i]) {
				ret++;
			}
		}
		System.out.println(ret);
	}
}
