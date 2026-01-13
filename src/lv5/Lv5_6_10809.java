package lv5;

import java.util.Scanner;

public class Lv5_6_10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String[] words = word.split("");

        int a = (int) 'a';
        int z = (int) 'z';
        String answer = "";

        for(int i = a; i <= z; i++) {
            int index = -1;

            for(int j = 0; j < words.length; j++) {
                int wordNum = (int) words[j].charAt(0);
                if(wordNum == i) {
                    index = j;
                    break;
                }
            }

            answer += (index + " ");
        }

        System.out.print(answer);

        scanner.close();
    }
}
