package lv6;

import java.util.Scanner;
import java.util.Arrays;

public class Lv6_8_25206 {
    public static void main(String[] args) {
        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] score = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        double sumGrade = 0.0;
        double sumScore = 0.0;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 20; i++) {
            String line = scanner.nextLine();
            String[] data = line.split(" ");

            int idx = Arrays.asList(grade).indexOf(data[2]);
            if(idx > -1) {
                sumGrade += Double.parseDouble(data[1]);
                sumScore += Double.parseDouble(data[1]) * score[idx];
            }
        }

        System.out.println(sumScore / sumGrade);

        scanner.close();
    }
}
