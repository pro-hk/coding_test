package lv4;

import java.util.Scanner;

public class Lv4_3_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int min = 0;
        int max = 0;

        for(int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            if(i == 0) {
                min = A;
                max = A;
            }

            if(A < min) min = A;
            if(A > max) max = A;
        }

        System.out.print(min + " " + max);
    }
}
