package lv2;

import java.util.Scanner;

public class Lv2_1_1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        scanner.close();

        if(A > B) {
            System.out.print(">");
        } else if(B > A) {
            System.out.print("<");
        } else {
            System.out.print("==");
        }
    }
}
