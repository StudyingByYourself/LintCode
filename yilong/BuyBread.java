package examquestion;

import java.util.Scanner;

public class BuyBread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] goods = new int[n];
		for (int i = 0; i < goods.length; i++) {
			goods[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] needGoods = new int[m];
		int[] amount = new int[m];
		for (int i = 0; i < m; i++) {
			needGoods[i] = sc.nextInt() - 1;
			amount[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < m; i++) {
			sum += goods[needGoods[i]] * amount[i];
		}
		System.out.println(sum);
		sc.close();
	}
}
