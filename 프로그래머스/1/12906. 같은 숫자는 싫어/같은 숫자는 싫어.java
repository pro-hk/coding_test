import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Queue<Integer> queue = new LinkedList();
        Stack<Integer> stack = new Stack();
        queue.add(arr[0]);
        stack.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            int peek = stack.peek();
            int num = arr[i];
            if(peek != num) {
                queue.add(num);
                stack.add(num);
            }
        }
        
        answer = new int[queue.size()];
        int idx = 0;
        while(!queue.isEmpty()) {
            int num = queue.poll();
            answer[idx] = num;
            idx++;
        }

        return answer;
    }
}