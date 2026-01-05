package lv1;

import java.util.Scanner;

public class Lv1_2_Scanner_A_Plus_B_1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.print(A+B);

        scanner.close(); // 누락함. 닫는 것이 좋음. 프린트 위에 선언해도 됨
    }
}
