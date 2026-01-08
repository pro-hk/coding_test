package lv3;

import java.util.Scanner;

public class Lv3_3_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.print(sum);

        scanner.close();
    }
}
