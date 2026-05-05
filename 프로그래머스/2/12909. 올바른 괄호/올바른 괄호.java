import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        /* 효율성 0
        while(s.indexOf("()") > -1) {
            s = s.replaceAll("\\(\\)", "");
        }
        
        if(s.length() > 0) answer = false;
        */
        
        /* 효율성 1 실패
        // 짝수개 확인
        int len = s.length();
        if(len % 2 == 1) return false;
        
        // (, ) 갯수 동일한지 확인
        if(len != (s.replaceAll("\\(", "").length() * 2)) return false;
        
        
        String[] list = s.split("");
        
        Stack st = new Stack();
        
        for(int i = 0; i < list.length; i++) {
            String c = list[i];
            
            if(c.equals("(")) {
                st.push(c);
            } else if(c.equals(")") && !st.empty()) {
                st.pop();
            } else {
                answer = false;
                break;
            }
        }
        */
        
        // 효율성 1 실패 (String -> char 배열 변경) 
        
        // (, ) 짝 확인
        if(s.length() != s.replaceAll("\\(", "").length() * 2) return false;
        
        char[] charArr = s.toCharArray();
        int len = charArr.length;
        
        // 짝수개 체크
        if(len % 2 == 1) return false;
        
        Stack<Character> st = new Stack();
        
        for(int i = 0; i < len; i++) {
            char c = charArr[i];
            
            if(c == '(') {
                st.push(c);
            } else if (c == ')' && !st.empty()) {
                st.pop();
            } else {
                return false;
            }
        }

        return answer;
    }
}