package examquestion;

import java.util.Scanner;

public class CarLimit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int day = sc.nextInt();
		carLimit(s, day);
		sc.close();
	}
	
	public static void carLimit(String s, int day) {
		if (day < 1 || day > 7) {
			System.out.println("error");
			return;
		}
		String[] sp = s.split(",");
		int[] temp = new int[sp.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = -1;
		}
		for (int i = 0; i < sp.length; i++) {
			if (sp[i].length() != 5 || sp[i].matches("[a-zA-Z]+")) {
				System.out.println("error");
				return;
			}
			if (day == 6 || day == 7) {
				System.out.println("none");
			}
			for (int j = sp[i].length() - 1; j >= 0; j--) {
				String number = String.valueOf(sp[i].charAt(j));
				if (number.matches("[0-9]")) {
					temp[i] = Integer.valueOf(number);
					break;
				}
			}
		}
		boolean flag = false;
		for (int i = 0; i < temp.length; i++) {
			if (match(day, temp[i])) {
				flag = true;
				System.out.println(sp[i]);
			}
		}
		if (!flag) {
			System.out.println("none");
		}
	}
	
	private static boolean match(int day, int number) {
		if (day == number || day + number == 10) {
			return true;
		}
		if (day == 5 && number == 0) {
			return true;
		}
		return false;
	}
}
