package lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Lv3_8_11022 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());

        for(int i = 1; i <= T; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            bufferedWriter.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
