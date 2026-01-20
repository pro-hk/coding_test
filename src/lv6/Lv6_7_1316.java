package lv6;

import java.util.Scanner;

public class Lv6_7_1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int total = 0;

        for(int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            int count = 1;

            while(word.length() > 0) {
                String alpha = word.substring(0, 1);
                word = word.replaceFirst(alpha, "");

                if(word.indexOf(alpha) > 0) {
                    count = 0;
                    break;
                }
            }

            total += count;
        }

        System.out.print(total);

        scanner.close();
    }
}
