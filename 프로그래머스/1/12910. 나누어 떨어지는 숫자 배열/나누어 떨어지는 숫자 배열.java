import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        int cnt = 0;
        for(int i : arr) {
            if(i % divisor == 0) cnt++;
        }
        
        if(cnt == 0) answer = new int[]{-1};
        else {
            answer = new int[cnt];
            cnt = 0;
            for(int i : arr) {
                if(i % divisor == 0) {
                    answer[cnt] = i;
                    cnt++;
                }
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}