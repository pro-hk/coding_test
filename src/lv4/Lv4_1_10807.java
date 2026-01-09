package lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Lv4_1_10807 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        String[] input = bufferedReader.readLine().split(" ");
        int number = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        for(int i = 0; i < input.length; i++) {
            if(Integer.parseInt(input[i]) == number) count++;
        }

        bufferedWriter.write(Integer.toString(count));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
