import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap();
        Queue<Integer> queue = new LinkedList();
        int max = 0;
        for(int i : priorities) {
            queue.add(i);
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
            if(i > max) max = i;
        }
        
        int idx = 0;
        while(true) {
            idx %= queue.size();
            
            int p = queue.poll();
            if(p == max) {
                answer++;
                if(idx == location) break;
                
                int cnt = map.get(p) - 1;
                map.put(p, cnt);
                if(idx < location) location--;
                idx--;
                
                // 0인 경우 새로운 max값 찾기
                if(cnt == 0) {
                    max = 0;
                    for(int i : map.keySet()) {
                        if(map.get(i) > 0 && i > max) max = i;
                    }
                }
            } else {
                queue.add(p);
            }
            
            idx++;
        }
        
        return answer;
    }
}