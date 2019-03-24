package examquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiniteField {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(finiteField(n));
		sc.close();
	}

	private static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> prime(int number) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			if (isPrime(i)) {
				list.add(i);
			}
		}
		return list;
	}

	public static int finiteField(int number) {
		int ret = 0;
		List<Integer> list = prime(number);
		for (int i = 1; i <= number; i++) {
			for (int j = 0; j < list.size(); j++) {
				for (int k = 1; Math.pow(list.get(j), k) <= i; k++) {
					if (Math.pow(list.get(j), k) == i) {
						ret++;
					}
				}
			}
		}
		return ret;
	}
}
