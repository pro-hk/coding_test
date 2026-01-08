package lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Lv3_12_10951 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            while(true) {
                String[] inputs = bufferedReader.readLine().split(" ");
                int A = Integer.parseInt(inputs[0]);
                int B = Integer.parseInt(inputs[1]);

                bufferedWriter.write((A + B) + "\n");
                bufferedWriter.flush();
            }
        } catch (Exception e) {
            bufferedWriter.close();
        }

        // 첫 제출 때는 null이나 빈값일 때 break 했으나, try-catch로 작업하는게 좋다고 해서 다시 제출
    }
}