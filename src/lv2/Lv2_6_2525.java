package lv2;

import java.util.Scanner;

public class Lv2_6_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = (B + C) / 60;   // 초과되는 분을 시간으로 환산
        int H, M;

        H = (A + D) % 24;
        M = (B + C) % 60;

        System.out.print(H + " " + M);

        scanner.close();
    }
}
