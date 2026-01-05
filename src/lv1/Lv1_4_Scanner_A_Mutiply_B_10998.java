package lv1;

import java.util.Scanner;

public class Lv1_4_Scanner_A_Mutiply_B_10998 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        scanner.close();

        System.out.print(A*B);
    }
}
