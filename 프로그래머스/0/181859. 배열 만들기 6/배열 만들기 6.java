import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack();
        
        for(int i : arr) {
            if(stack.empty()) stack.push(i);
            else {
                int peek = stack.peek();
                if(peek == i) stack.pop();
                else stack.push(i);
            }
        }
        
        int len = stack.size();
        
        answer = new int[len];
        for(int i = 0; i < len; i++) {
            answer[i] = stack.get(i);
        }
        
        if(len == 0) answer = new int[]{-1};
        
        return answer;
    }
}