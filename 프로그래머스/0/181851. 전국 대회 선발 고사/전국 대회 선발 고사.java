import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        int len = 0;
        for(boolean b : attendance) {
            if(b) len++;
        }
        
        int[] attend = new int[len];
        int idx = 0;
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                attend[idx] = rank[i] * 100 + i;
                idx++;
            }
        }
        
        Arrays.sort(attend);
        
        answer += (attend[0] % 100) * 10000 + (attend[1] % 100) * 100 + (attend[2] % 100);
        
        return answer;
    }
}