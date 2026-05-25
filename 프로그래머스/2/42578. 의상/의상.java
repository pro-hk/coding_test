import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap();
        for(String[] s1 : clothes) {
            int cnt = map.containsKey(s1[1]) ? map.get(s1[1]) + 1 : 1;
            map.put(s1[1], cnt);
        }
        
        for(String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }
        
        // 모두 0개 선택한 경우 제외
        answer--;
        
        return answer;
    }
}