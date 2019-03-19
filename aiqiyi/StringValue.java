package examquestion;

import java.util.Arrays;
import java.util.Scanner;

//每次最大的值减一，得到的价值最小
public class StringValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		System.out.println(minValue(s, k));
		sc.close();
	}
	
	public static int minValue(String s ,int k) {
		int[] f = new int[26];
		for (int i = 0; i < s.length(); i++) {
			f[s.charAt(i) - 'a']++;
		}
		Arrays.sort(f);
		int sum = 0;
		for (int i = f.length - 1; i >= 0; i--) {
			while(f[i] > 0 && k > 0) {
				f[i]--;
				k--;
				Arrays.sort(f);
			}
			if (f[i] > 0) {
				sum += f[i] * f[i];				
			}
		}
		return sum;
	}
}
