package examquestion;

import java.util.HashSet;
import java.util.Scanner;

public class DNASequence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int i, j, n = input.length();
		for (i = 1; i <= n; i++) {
			HashSet<String> set = new HashSet<>();
			for (j = 0; j <= n - i; j++) {
				set.add(input.substring(j, j + i));				
			}
			if (set.size() < Math.pow(4, i)) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}
