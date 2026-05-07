import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long tmp = n;
        int len = (int) Math.log10(tmp) + 1;
        long[] array = new long[len];
        
        for(int i = 0; i < len; i++) {
            array[i] = tmp % 10;
            tmp = tmp / 10;
        }
        
        Arrays.sort(array);
        
        for(int i = 1; i <= len; i++) {
            answer = 10 * answer + array[len - i];
        }
        
        return answer;
    }
}