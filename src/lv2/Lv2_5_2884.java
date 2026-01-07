package lv2;

import java.util.Scanner;

public class Lv2_5_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if(M - 45 < 0) {
            if(H == 0) {
                H = 23;
            } else {
                H--;
            }
            M += 15;
        } else {
            M -= 45;
        }

        System.out.print(H + " " + M);

        scanner.close();
    }
}
