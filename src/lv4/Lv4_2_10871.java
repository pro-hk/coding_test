package lv4;

import java.util.Scanner;

public class Lv4_2_10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        String answer = "";

        for(int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            if(A < X) answer += (A + " ");
        }

        System.out.print(answer);

        scanner.close();
    }
}
