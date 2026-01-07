package lv2;

import java.util.Scanner;

public class Lv2_7_2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if(A == B && B == C) {
            System.out.print(10000 + (A * 1000));   // 모두 같은 경우
        } else if (A == B || B == C) {
            System.out.print(1000 + (B * 100));     // 2개 같은 경우
        } else if (C == A) {
            System.out.print(1000 + (C * 100));     // 2개 같은 경우
        } else if(A - B > 0 && A - C > 0) {
            System.out.print(A * 100);              // 모두 다른 경우(A가 제일 큼)
        } else if(B - A > 0 && B - C > 0) {
            System.out.print(B * 100);              // 모두 다른 경우(B가 제일 큼)
        } else {
            System.out.print(C * 100);              // 모두 다른 경우(C가ㅇ 제일 큼)
        }

        scanner.close();
    }
}
