package lv5;

import java.util.Scanner;

public class Lv5_9_2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        String[] numbers = number.split(" ");
        int num1 = 0;
        int num2 = 0;

        for(int i = 0; i < numbers.length; i++) {
            String[] tmp = numbers[i].split("");
            String reverse = "";
            int size = tmp.length - 1;
            for(int j = size; j >= 0; j--) {
                reverse = reverse.concat(tmp[j]);
            }
            if(i == 0) num1 = Integer.parseInt(reverse);
            else num2 = Integer.parseInt(reverse);
        }

        if(num1 > num2) System.out.print(num1);
        else System.out.print(num2);

        scanner.close();
    }
}
