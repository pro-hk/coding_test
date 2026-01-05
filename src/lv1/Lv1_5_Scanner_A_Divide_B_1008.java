package lv1;

import java.util.Scanner;

public class Lv1_5_Scanner_A_Divide_B_1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        scanner.close();

        System.out.print((double)A/B);

        // 소수점 관련 형변환 검색해서 찾음
    }
}
