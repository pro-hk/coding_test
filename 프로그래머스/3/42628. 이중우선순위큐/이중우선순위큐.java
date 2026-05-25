import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        
        Queue<Integer> minQ = new PriorityQueue();                           // 오름차순
        Queue<Integer> maxQ = new PriorityQueue(Collections.reverseOrder()); // 내림차순
        int cnt = 0;
        
        for(String s : operations) {
            String[] strArr = s.split(" ");
            
            int num = Integer.parseInt(strArr[1]);
            if(strArr[0].equals("I")) {
                cnt++;
                minQ.add(num);
                maxQ.add(num);
            } else if(cnt > 0) {
                cnt--;
                if(num > 0)  maxQ.poll();
                else minQ.poll();
                
                // 모두 삭제된 경우 큐 초기화
                if(cnt == 0) {
                    minQ.clear();
                    maxQ.clear();
                }
            }
        }
        
        int idx = 0;
        // 가장 작은 수가 맞는지 체크
        while(idx < cnt) {
            if(!maxQ.contains(minQ.peek())) minQ.poll();
            if(!minQ.contains(maxQ.peek())) maxQ.poll();
            idx++;
        }
        
        if(cnt > 0) {
            answer[0] = maxQ.poll();
            answer[1] = minQ.poll();
        }

        return answer;
    }
}