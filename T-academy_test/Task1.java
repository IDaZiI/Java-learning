package code;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] cnt = new int[1001];
        for (int i = 0; i < N; i++) {
            cnt[scanner.nextInt()]++;
        }
        int odd = 0;
        for (int i = 1; i <= 1000; i++) {
            if (cnt[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println(odd <= 1 ? "YES" : "NO");
        scanner.close();
    }
}
