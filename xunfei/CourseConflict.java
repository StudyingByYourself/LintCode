package examquestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CourseConflict {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] clzTime = new String[n];
		String[] courseId = new String[n];
		for (int i = 0; i < n; i++) {
			clzTime[i] = sc.next();
			courseId[i] = sc.next();
		}
		clzTimeConflict(clzTime, courseId);
		sc.close();
	}
	
	public static void clzTimeConflict(String[] clzTime, String[] courseId) {
		Map<String, List<String>> map = new TreeMap<>(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for (int i = 0; i < clzTime.length; i++) {
			if (!map.containsKey(clzTime[i])) {
				List<String> list = new ArrayList<>();
				list.add(courseId[i]);
				map.put(clzTime[i], list);
			} else {
				List<String> list = map.get(clzTime[i]);
				list.add(courseId[i]);
				map.put(clzTime[i], list);
			}
		}
		boolean flag = true;
		for (String string : map.keySet()) {
			if (map.get(string).size() > 1) {
				flag = false;
				System.out.print(string + " ");
				List<String> list = map.get(string);
				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i));
					if (i != list.size() - 1) {
						System.out.print(" ");
					} else {
						System.out.println();
					}
				}
			}
		}
		if (flag) {
			System.out.println("YES");
		}
	}
}
