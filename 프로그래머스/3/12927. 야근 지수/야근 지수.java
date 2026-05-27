import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        int sum = 0;
        // 내림차순으로 정리
        Queue<Integer> queue = new PriorityQueue(Collections.reverseOrder());
        for(int i : works) {
            queue.add(i);
            sum += i;
        }
        
        if(sum <= n) return 0;
        
        int cnt = 0;
        while(cnt < n) {
            int num = queue.poll();
            
            queue.add(num - 1);
            cnt++;
        }
        
        cnt = 0;
        for(int i : works) {
            int num = queue.poll();
            answer += num * num;
        }
        
        return answer;
    }
}