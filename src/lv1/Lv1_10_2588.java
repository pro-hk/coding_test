package lv1;

import java.util.Scanner;

public class Lv1_10_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = A*(B%10);
        int D = A*((B%100-B%10)/10);
        int E = A*(B/100);

        scanner.close();

        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.print(C+(D*10)+(E*100));
    }
}
