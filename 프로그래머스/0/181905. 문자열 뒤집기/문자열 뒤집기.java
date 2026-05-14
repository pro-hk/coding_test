import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        
        sb.append(my_string.substring(0, s));
        
        Stack<Character> st = new Stack<>();
        for(int i = s; i <= e; i++) {
            st.push(my_string.charAt(i));
        }
        
        for(int i = s; i <= e; i++) {
            sb.append(st.pop());
        }
        
        sb.append(my_string.substring(e + 1));
        
        answer = sb.toString();
        
        return answer;
    }
}