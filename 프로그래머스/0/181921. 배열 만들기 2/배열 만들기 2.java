import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        boolean t = false;

        for(int i = l; i <= r; i++) {
            int n = i;
            while(n > 0) {
                t = (n % 10 == 0 || n % 10 == 5);
                if(!t) break;
                n /= 10;
            }
            if(t) list.add(i);
        }

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        if(answer.length == 0) answer = new int[]{-1};
        
        return answer;
    }
}