package lv5;

import java.util.Scanner;

public class Lv5_7_2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        String P = "";

        for(int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            String S = scanner.next();
            String[] words = S.split("");
            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    P += words[j];
                }
            }
            P += "\n";
        }

        System.out.print(P);

        scanner.close();
    }
}
