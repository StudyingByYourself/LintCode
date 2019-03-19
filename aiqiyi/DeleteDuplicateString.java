package examquestion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeleteDuplicateString {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(delDuplicate(s));
        sc.close();
    }
    
    public static String delDuplicate(String s){
    	Queue<Character> q = new LinkedList<>();
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
			if (!q.contains(c)) {
				q.add(c);
			}
		}
        StringBuilder ret = new StringBuilder();
        while(!q.isEmpty()) {
        	ret.append(q.remove());
        }
        return ret.toString();
    }
}
