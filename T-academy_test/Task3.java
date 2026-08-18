package code;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[][][] dp = new int[n][n][k + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][i][j] = a[i];
            }
        }

        for (int len = 2; len <= n; len++) {

            for (int l = 0; l + len <= n; l++) {

                int r = l + len - 1;

                for (int used = 0; used <= k; used++) {

                    dp[l][r][used] = Math.max(
                            dp[l + 1][r][used],
                            dp[l][r - 1][used]
                    );

                    int need = (s.charAt(l) == s.charAt(r)) ? 0 : 1;

                    if (used >= need) {

                        int inside = 0;

                        if (l + 1 <= r - 1) {
                            inside = dp[l + 1][r - 1][used - need];
                        }

                        dp[l][r][used] = Math.max(
                                dp[l][r][used],
                                inside + a[l] + a[r]
                        );
                    }
                }
            }
        }
        if (dp[0][n - 1][k] > 0)
            System.out.println(dp[0][n - 1][k]);
        else System.out.println(0);
        sc.close();
    }
}