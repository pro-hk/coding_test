package lv5;

import java.util.Scanner;

public class Lv5_8_1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentense = scanner.nextLine().trim();
        int count = 0;

        if(!sentense.equals("")) {
            String[] words = sentense.split(" ");
            count = words.length;
        }

        System.out.print(count);

        scanner.close();
    }
}
