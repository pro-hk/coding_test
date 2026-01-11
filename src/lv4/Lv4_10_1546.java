package lv4;

import java.util.Scanner;

public class Lv4_10_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] scores = new int[N];
        int max = 0;
        double avg = 0;

        for(int i = 0; i < N; i++) {
            int score = scanner.nextInt();
            scores[i] = score;

            if(score > max) max = score;
        }

        for(int i = 0; i < N; i++) {
            avg += (double) scores[i] / max * 100;
        }

        System.out.print(avg/N);

        scanner.close();
    }
}
