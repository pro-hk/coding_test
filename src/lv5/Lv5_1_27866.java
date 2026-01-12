package lv5;

import java.util.Scanner;

public class Lv5_1_27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        int i = scanner.nextInt();

        System.out.print(S.charAt(i - 1));

        scanner.close();
    }
}
