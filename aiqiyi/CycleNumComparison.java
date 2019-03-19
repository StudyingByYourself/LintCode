package examquestion;

import java.util.Scanner;

public class CycleNumComparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int k1 = sc.nextInt();
		int x2 = sc.nextInt();
		int k2 = sc.nextInt();
		repeat(x1, k1, x2, k2);
		sc.close();
	}
	
	public static void repeat(int x1, int k1, int x2, int k2) {
		String v1 = String.valueOf(x1);
		for (int i = 1; i < k1; i++) {
			v1 += String.valueOf(x1);
		}
		String v2 = String.valueOf(x2);
		for (int i = 1; i < k2; i++) {
			v2 += String.valueOf(x2);
		}
		if (v1.length() < v2.length()) {
			System.out.println("Less");
			return;
		} else if (v1.length() > v2.length()) {
			System.out.println("Greater");
			return;
		} 
		for (int i = 0; i < v1.length(); i++) {
			if (v1.charAt(i) > v2.charAt(i)) {
				System.out.println("Greater");
				return;
			} else if (v1.charAt(i) < v2.charAt(i)) {
				System.out.println("Less");
				return;
			}
		}
		System.out.println("Equal");
	}

}
