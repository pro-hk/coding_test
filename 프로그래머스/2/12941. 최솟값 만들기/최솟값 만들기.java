import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        /* 효율성 0
        int len = A.length;
        for(int i = 0; i < len; i++) {
            Arrays.sort(A);
            Arrays.sort(B);
            
            // 현재 가장 작은 값과 가장 큰 값을 곱하고 0으로 변경
            if(A[i] < B[i]) {
                answer += A[i] * B[len - 1];
                A[i] = 0;
                B[len - 1] = 0;
            } else {
                answer += B[i] * A[len - 1];
                B[i] = 0;
                A[len - 1] = 0;
            }
        }
        */
        
        // 최초 1회만 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        int len = A.length;
        int minA = 0;
        int minB = 0;
        int maxA = len - 1;
        int maxB = len - 1;
        
        for(int i = 0; i < len; i++) {
            // 현재 가장 작은 값과 가장 큰 값을 곱하고 0으로 변경
            if(A[minA] < B[minB]) {
                answer += A[minA] * B[maxB];
                minA++;
                maxB--;
            } else {
                answer += B[minB] * A[maxA];
                minB++;
                maxA--;
            }
        }

        return answer;
    }
}