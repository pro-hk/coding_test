package lv4;

import java.util.Scanner;

public class Lv4_6_10813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] box = new int[N];
        String answer = "";

        for(int n = 0; n < N; n++) {
            box[n] = n + 1;
        }

        for(int m = 0; m < M; m++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int tmp = 0;

            for(int n = 0; n < N; n++) {
                if(i == (n + 1)) {
                    tmp = box[j - 1];
                    box[j - 1] = box[n];
                }
                if(j == (n + 1)) box[i - 1] = tmp;
            }
        }

        for(int l = 0; l < box.length; l++) {
            answer += box[l] + " ";
        }

        System.out.print(answer);

        scanner.close();
    }
}
