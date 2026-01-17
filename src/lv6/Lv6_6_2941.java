package lv6;

import java.util.Scanner;

public class Lv6_6_2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alphas = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = scanner.nextLine();
        String replaceWord = word;
        int sum = 0;

        for(int i = 0; i < alphas.length; i++) {
            String alpha = alphas[i];
            int alphaLength = alpha.length();

            if(!word.contains(alpha)) continue;

            int length = replaceWord.length();
            replaceWord = replaceWord.replaceAll(alpha, "");
            sum += (length - replaceWord.length()) / alphaLength;
        }

        sum += replaceWord.length();
        System.out.print(sum);

        scanner.close();
    }
}
