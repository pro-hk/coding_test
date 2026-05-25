import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        Arrays.sort(num_list);
        
        int len = num_list.length;
        int idx = 0;
        answer = new int[len - 5];
        for(int i = 5; i < len; i++) {
            answer[idx] = num_list[i];
            idx++;
        }
        
        return answer;
    }
}