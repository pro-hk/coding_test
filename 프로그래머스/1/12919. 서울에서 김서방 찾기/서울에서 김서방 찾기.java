import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        
        int x = Arrays.asList(seoul).indexOf("Kim");
        
        sb.append("김서방은 " + x +"에 있다");
        answer = sb.toString();
        
        return answer;
    }
}