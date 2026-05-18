import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        // 소인수분해
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            int cnt = 0;
            int d = 2;
            while(i > 1) {
                if(i % d == 0) {
                    i /= d;
                    cnt++;
                } else {
                    d++;
                    cnt = 0;
                }
                
                if(cnt > 0 && i % d > 0) {
                    if(map.containsKey(d) && cnt < map.get(d)) cnt = map.get(d);
                    map.put(d, cnt);
                }
            }
        }
        
        for(int k : map.keySet()) {
            int v = map.get(k);
            answer *= Math.pow(k, v);
        }
        
        return answer;
    }
}