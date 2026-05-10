import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> l = new ArrayList<>();
        int n1 = n;
        while(n1 > 1) {
            l.add(n1);
            n1 = n1 % 2 == 0 ? n1 / 2 : n1 * 3 + 1;
        }
        l.add(n1);
        
        answer = new int[l.size()];
        for(int i = 0; i < l.size(); i++) {
            answer[i] = l.get(i);
        }
        
        return answer;
    }
}