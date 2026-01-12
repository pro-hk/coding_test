package lv5;

import java.util.Scanner;

public class Lv5_3_9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        String answer = "";

        for(int i = 0; i < T; i++) {
            String word = scanner.next();
            answer += word.charAt(0) + "" + word.charAt(word.length() - 1) + "\n";
        }

        System.out.print(answer);

        scanner.close();
    }
}
