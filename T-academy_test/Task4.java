package code;

import java.util.Scanner;
import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        int total = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                total++;
            } else {
                total--;
            }
        }

        if (total == 0) {
            System.out.println(0);
            scanner.close();
            return;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);

        int prefix = 0;
        int answer = n + 1;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                prefix++;
            } else {
                prefix--;
            }

            if (map.containsKey(prefix - total)) {
                int left = map.get(prefix - total);
                answer = Math.min(answer, i + 1 - left);
            }
            map.put(prefix, i + 1);
        }
        if (answer == n) {
            System.out.println(-1);
        } else if (answer == n + 1) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }

        scanner.close();
    }
}