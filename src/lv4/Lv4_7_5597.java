package lv4;

import java.util.Arrays;
import java.util.Scanner;

public class Lv4_7_5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[28];

        for(int i = 0; i < numbers.length; i++) {
            int number = scanner.nextInt();
            int tmp = 0;
            if(i == 0) numbers[i] = number;

            // 오름차순으로 정렬
            for(int j = 0; j < i; j++) {
                if(numbers[j] > number) {
                    tmp = numbers[j];
                    numbers[j] = number;
                    number = tmp;
                }

                if(j == (i - 1)) {
                    numbers[i] = number;
                }
            }
        }

        int diff = 1;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != i + diff) {
                System.out.println(i + diff);
                diff++;
            }

            // 28까지 입력한 경우 제대로 출력 안됨
            if(i == (numbers.length - 1)) {
                for(int j = (numbers.length + diff); j <= 30; j++) {
                    System.out.println(j);
                }
            }
        }

        scanner.close();
    }
}
