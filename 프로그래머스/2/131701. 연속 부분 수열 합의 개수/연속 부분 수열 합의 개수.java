import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < elements.length; i++) {
            for(int j = 1; j <= elements.length; j++) {
                int sum = 0;
                int idx = 0;
                int k = i;
                
                while(idx < j) {
                    if(k == elements.length) k = 0;
                    sum += elements[k];
                    idx++;
                    k++;
                }
                set.add(sum);
            }
        }
        
        answer = set.size();
        
        return answer;
    }
}