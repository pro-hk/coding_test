import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int cnt = 0;
        char[] charArr = s.toCharArray();
        int len = charArr.length;
        Stack<Character> stack = new Stack();
        
        while(cnt < len) {
            for(int i = cnt; i < len + cnt; i++) {
                boolean collect = true;
                char c = charArr[i % len];
                
                if(stack.isEmpty()) {
                    stack.push(c);
                    continue;
                }
                
                switch(stack.peek()) {
                    case '(' : 
                        if(c == ')') stack.pop();
                        else if(c == '[' || c == '{' || c == '(') stack.push(c);
                        else collect = false;
                        break;
                    case '[' : 
                        if(c == ']') stack.pop();
                        else if(c == '[' || c == '{' || c == '(') stack.push(c);
                        else collect = false;
                        break;
                    case '{' : 
                        if(c == '}') stack.pop();
                        else if(c == '[' || c == '{' || c == '(') stack.push(c);
                        else collect = false;
                        break;
                    default : 
                        collect = false;
                        break;
                }
                
                if(!collect) break;
            }
            if(stack.isEmpty()) answer++;
            stack.clear();
            cnt++;
        }
        
        return answer;
    }
}