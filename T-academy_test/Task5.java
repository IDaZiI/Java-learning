package code;

import java.util.*;

public class Task5 {

    static class Tower {
        int l;
        int r;

        Tower(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        Tower[] towers = new Tower[Q];

        for (int i = 0; i < Q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            towers[i] = new Tower(l, r);
        }

        Arrays.sort(towers, (a, b) -> {
            if (a.l != b.l) {
                return Integer.compare(a.l, b.l);
            }
            return Integer.compare(b.r, a.r);
        });

        int count = 0;
        int pos = 0; 
        int i = 0;

        while (pos < N) {

            int best = pos;
            while (i < Q && towers[i].l <= pos + 1) {
                best = Math.max(best, towers[i].r);
                i++;
            }

            if (best == pos) {
                System.out.println("No");
                scanner.close();
                return;
            }

            pos = best;
            count++;
        }

        System.out.println("Yes");
        System.out.println(count);

        scanner.close();
    }
}
