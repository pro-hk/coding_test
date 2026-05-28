import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        int cnt = 0;
        int days = 0;
        Queue<Integer> queue = new LinkedList();
        for(int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int day = (remain / speeds[i]) + (remain % speeds[i] == 0 ? 0 : 1);
            
            if(i == 0) days = day;
            
            if(day <= days) {
                cnt++;
            } else {
                days = day;
                queue.add(cnt);
                cnt = 1;
            }
        }
        
        if(cnt > 0) queue.add(cnt);
        
        answer = new int[queue.size()];
        
        int idx = 0;
        while(!queue.isEmpty()) {
            answer[idx] = queue.poll();
            idx++;
        }
        
        return answer;
    }
}