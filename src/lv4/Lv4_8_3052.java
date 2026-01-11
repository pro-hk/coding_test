package lv4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lv4_8_3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];
        int count = numbers.length;

        for(int i = 0; i < numbers.length; i++) {
            int number= Integer.parseInt(bufferedReader.readLine()) % 42;
            numbers[i] = number;

            for(int j = 0; j < i; j++) {
                if(numbers[j] == number) {
                    count--;
                    break;
                }
            }
        }

        System.out.print(count);
    }
}
