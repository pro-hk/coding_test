import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        
        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        
        for(char c : charArr) {
            stack.push(c);
        }
        
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        answer = sb.toString();
        
        return answer;
    }
}