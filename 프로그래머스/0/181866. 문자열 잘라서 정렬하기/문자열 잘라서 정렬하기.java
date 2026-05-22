import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        
        char[] charArr = myString.toCharArray();
        
        int idx = 0;
        int cnt = 0;
        boolean b = false;
        for(char c : charArr) {
            if(c == 'x') {
                if(b) idx++;
                b = false;
                cnt = 0;
            } else {
                b = true;
                cnt++;
            }
        }
        
        if(cnt > 0) idx++;
        
        answer = new String[idx];
        
        idx = 0;
        StringBuffer sb = new StringBuffer();
        for(char c : charArr) {
            if(c != 'x') sb.append(c);
            else if(sb.length() > 0) {
                answer[idx] = sb.toString();
                idx++;
                sb = new StringBuffer();
            }
        }
        
        if(sb.length() > 0) answer[idx] = sb.toString();
        
        Arrays.sort(answer);
        
        return answer;
    }
}