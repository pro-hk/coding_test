package lv4;

import java.util.Scanner;

public class Lv4_9_10811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] box = new int[N];
        String answer = "";

        for(int k = 0; k < N; k++) {
            box[k] = k + 1;
        }

        for(int k = 0; k < M; k++) {
            int i = scanner.nextInt() - 1;
            int j = scanner.nextInt() - 1;
            int mid = (i + j) / 2;
            int tmp = 0;

            for(int l = i; l <= mid; l++) {
                tmp = box[l];
                box[l] = box[j];
                box[j] = tmp;
                j--;
            }
        }

        for(int k = 0; k < N; k++) {
            answer += box[k] + " ";
        }

        System.out.print(answer);

        scanner.close();
    }
}
