package examquestion;

import java.util.Arrays;
import java.util.Scanner;

public class PieceTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		triangle(arr);
		sc.close();
	}
	
	public static void triangle(int[] arr) {
		Arrays.sort(arr);
		while(arr[0] + arr[1] <= arr[2]) {
			arr[2]--;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
