import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap();
        for(int i : array) {
            int cnt = map.containsKey(i) ? map.get(i) + 1 : 1;
            map.put(i, cnt);
        }
        
        boolean dup = false;
        int max = 0;
        for(int i : map.keySet()) {
            if(map.get(i) > max) {
                max = map.get(i);
                dup = false;
                answer = i;
            } else if(map.get(i) == max) {
                dup = true;
            }
        }
        
        if(dup) answer = -1;
        
        return answer;
    }
}