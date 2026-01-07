package lv2;

import java.util.Scanner;

public class Lv2_3_2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

        scanner.close();
    }
}
