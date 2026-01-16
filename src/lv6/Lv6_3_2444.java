package lv6;

import java.util.Scanner;

public class Lv6_3_2444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int lineCount = 2 * N - 1;

        for(int i = 1; i <= lineCount; i ++) {
            String starLine = "";
            int starCount = i <= N ? (2 * i - 1) : (lineCount - 2 * (i - N));
            int blankCount = i <= N ? (N - i) : (i - N);

            for(int j = 0; j < (blankCount + starCount); j++) {
                if(j < blankCount) starLine += " ";
                else starLine += "*";
            }

            System.out.println(starLine);
        }

        scanner.close();
    }
}
