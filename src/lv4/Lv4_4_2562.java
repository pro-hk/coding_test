package lv4;

import java.util.Scanner;

public class Lv4_4_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int index = 0;

        for(int i = 1; i <= 9; i++) {
            int N = scanner.nextInt();

            if(N > max) {
                max = N;
                index = i;
            }
        }

        System.out.println(max);
        System.out.print(index);

        scanner.close();
    }
}
