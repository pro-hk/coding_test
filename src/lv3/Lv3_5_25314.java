package lv3;

import java.util.Scanner;

public class Lv3_5_25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String name = "int";

        for(int i = 0; i < (N/4); i++) {
            name = "long " + name;
        }

        System.out.print(name);

        scanner.close();
    }
}
