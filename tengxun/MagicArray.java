package examquestion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String x = sc.next();
			String y = sc.next();
			isSquare(x, y);
		}
		sc.close();
	}

	public static void isSquare(String x, String y) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 3; i++) {
			int x1 = Integer.valueOf(x.charAt(i));
			int y1 = Integer.valueOf(y.charAt(i));
			for (int j = i + 1; j < 4; j++) {
				int x2 = Integer.valueOf(x.charAt(j));
				int y2 = Integer.valueOf(y.charAt(j));
				int length = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
				set.add(length);
			}
		}
		if (set.size() == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
