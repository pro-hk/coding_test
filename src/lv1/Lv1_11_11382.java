package lv1;

import java.util.Scanner;

public class Lv1_11_11382 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();

        scanner.close();

        System.out.print(A+B+C);

        // 10의 12승 값까지 포함해야해서 long(8바이트), int(4바이트)
    }
}
