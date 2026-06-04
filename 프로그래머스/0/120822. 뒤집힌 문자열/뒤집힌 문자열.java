import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] charArr = my_string.toCharArray();
        Stack<Character> stack = new Stack();
        for(char c : charArr) {
            stack.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            char c = stack.pop();
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}