package code;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] letters = new int[26]; 
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            int nowLetterSign = s.charAt(i) - 'a';
            for (int j = nowLetterSign + 1; j < 26; j++) {
                if (letters[j] > 0) cnt+=letters[j];
            }
            letters[nowLetterSign]++;
        }
        System.out.println(cnt);
        scanner.close();
    }
}
