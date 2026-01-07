package lv2;

import java.util.Scanner;

public class Lv2_4_14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x > 0 && y > 0) {
            System.out.print(1);
        } else if(x < 0 && y > 0) {
            System.out.print(2);
        } else if(x < 0 && y < 0) {
            System.out.print(3);
        } else if(x > 0 && y < 0) {
            System.out.print(4);
        }

        scanner.close();
    }
}
