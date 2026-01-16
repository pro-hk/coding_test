package lv6;

import java.util.Scanner;

public class Lv6_2_3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "";
        int[] pieces = {1, 1, 2, 2, 2, 8};

        String input = scanner.nextLine();
        String[] inputs = input.split(" ");

        for(int i = 0; i < pieces.length; i++) {
            int piece = Integer.parseInt(inputs[i]);
            int diff = pieces[i] - piece;
            answer += diff + " ";
        }

        System.out.print(answer);

        scanner.close();
    }
}
