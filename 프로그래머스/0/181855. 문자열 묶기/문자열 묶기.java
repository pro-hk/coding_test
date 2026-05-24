import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        int max = 0;
        Map<Integer, Integer> map = new HashMap();
        for(String s : strArr) {
            int len = s.length();
            int cnt = 1;
            
            if(map.containsKey(len)) cnt = map.get(len) + 1;
            map.put(len, cnt);
            
            if(max < cnt) max = cnt;
        }
        
        answer = max;
        
        return answer;
    }
}