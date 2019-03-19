package examquestion;

import java.util.Scanner;

public class TrueOrFalse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int ret = Math.min(t, a) + Math.min(n - t, n - a);
		System.out.println(ret);
		sc.close();
	}
}
