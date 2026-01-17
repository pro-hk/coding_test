package lv6;

import java.util.Scanner;

public class Lv6_4_10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int length = word.length();
        int answer = 1;

        for(int i = 0; i < (length / 2); i++) {
            if(word.charAt(i) != word.charAt(length - 1 - i)) {
                answer = 0;
                break;
            }
        }

        System.out.print(answer);

        scanner.close();
    }
}
