package lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Lv3_10_2439 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        String star = "";

        for(int i = 1; i <= N; i++) {
            int blankCount = N - i;
            for(int j = 0; j < blankCount; j++) {
                star += " ";
            }
            for(int k = 0; k < i; k++) {
                star += "*";
            }
            star += "\n";
        }

        bufferedWriter.write(star);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}