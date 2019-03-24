package examquestion;

import java.util.Scanner;

public class PasswordCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			boolean flag = passwordCheck(s);
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}

	public static boolean passwordCheck(String s) {
		int n = s.length();
		if (n < 8) {
			return false;
		}
		int digit = 0, lower = 0, upper = 0;
		for (int i = 0; i < n; i++) {
			int number = (int) s.charAt(i);
			if (i == 0 && number >= 48 && number <= 57) {
				return false;
			}
			if (number < 48 || (number > 58 && number < 65) 
					|| (number > 90 && number < 97) || number > 122) {
				return false;
			}
			if (number >= 48 && number <= 57) {
				digit = 1;
			} 
			if (number >= 65 && number <= 90) {
				upper = 1;
			} 
			if (number >= 97 && number <= 122) {
				lower = 1;
			}
		}
		if (digit + lower + upper < 2) {
			return false;
		}
		return true;
	}
}
