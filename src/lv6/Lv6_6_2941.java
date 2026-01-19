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

            int length = word.length();
            int replaceLength = word.replaceAll(alpha, "").length();
            if(alpha.equals("z=")) {
                length = word.replaceAll("dz=", "").length();
                replaceLength = word.replaceAll("dz=", "").replaceAll(alpha, "").length();
            }

            sum += (length - replaceLength) / alphaLength;

            replaceWord = replaceWord.replaceAll(alpha, " ");
        }

        sum += replaceWord.replaceAll(" ", "").length();
        System.out.print(sum);

        scanner.close();
    }
}
