package examquestion;

import java.util.Scanner;

public class PalindromePrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(findPalindromePrime(l, r));
		sc.close();
	}
	
	public static int findPalindromePrime(int l, int r) {
		int ret = 0;
		for (int i = l; i <= r; i++) {
			if (isPalindrome(i) && isPrime(i)) {
				ret++;
			}
		}
		return ret;
	}
	
	public static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome(int number) {
		String s = String.valueOf(number);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
			if (i > s.length() / 2) {
				return true;
			}
		}
		return true;
	}
}
