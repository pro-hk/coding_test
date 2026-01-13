package lv5;

import java.util.Scanner;

public class Lv5_5_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String input = scanner.next();
        String[] numbers = input.split("");
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            sum += number;
        }

        System.out.print(sum);

        scanner.close();
    }
}
