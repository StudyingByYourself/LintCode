package examquestion;

import java.util.Arrays;
import java.util.Scanner;

// 比较原数组和排序后新数组的每个位置的值，不一样加1
public class MinSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(minChangePosition(arr));
		sc.close();
	}
	
	public static int minChangePosition(int[] arr) {
		int[] newArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(newArr);
		int ret = 0;
		for (int i = 0; i < newArr.length; i++) {
			if (newArr[i] != arr[i]) {
				ret++;
			}
		}
		return ret;
	}
}
