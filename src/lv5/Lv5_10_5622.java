package lv5;

import java.util.Scanner;

public class Lv5_10_5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dial = scanner.next();
        String[] alpha = dial.split("");
        String[] numbers = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int diff = 3;
        int sum = 0;

        for(int i = 0; i < alpha.length; i++) {
            String A = alpha[i];

            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j].contains(A)) {
                    sum += (j + diff);
                    break;
                }
            }
        }

        System.out.print(sum);

        scanner.close();
    }
}
