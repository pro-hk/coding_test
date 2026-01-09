package lv4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lv4_5_10810 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);
        int[] box = new int[N];
        String answer = "";

        for(int l = 0; l < M; l++) {
            String[] input = bufferedReader.readLine().split(" ");
            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);
            for(int m = i; m <= j; m++) {
                box[m - 1] = k;
            }
        }

        for(int i = 0; i < N; i++) {
            answer += (box[i] + " ");
        }

        System.out.print(answer);
    }
}
