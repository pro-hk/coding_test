import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap();
        Set<Integer> set = new HashSet();
        for(int i : topping) {
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
        }

        for(int i = 0; i < topping.length; i++) {
            int t = topping[i];
            int cnt = map.get(t) - 1;
            if(cnt == 0) map.remove(t);
            else map.put(t, cnt);
            set.add(t);

            if(set.size() == map.keySet().size()) answer++;
        }
        
        return answer;
    }
}