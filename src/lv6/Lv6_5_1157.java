package lv6;

import java.util.Scanner;

public class Lv6_5_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toUpperCase();
        String answer = "";
        int count = 0;

        while(word.length() > 0) {
            int length = word.length();
            String c = word.substring(0, 1);
            word = word.replaceAll(c, "");
            int diff = length - word.length();
            if(count < diff) {
                answer = c;
                count = diff;
            } else if(count == diff) {
                answer += c;
            }
        }

        if(answer.length() > 1) answer = "?";

        System.out.print(answer);

        scanner.close();
    }
}
