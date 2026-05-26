import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
        Queue<Integer> q = new LinkedList();
        for(int i : arr) {
            boolean b = true;
            for(int j : delete_list) {
                if(i == j) {
                    b = false;
                    break;
                }
            }
            if(b) q.add(i);
        }
        
        answer = new int[q.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = q.poll();
        }
        
        return answer;
    }
}