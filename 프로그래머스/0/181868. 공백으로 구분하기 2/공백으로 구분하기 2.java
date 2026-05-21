class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        int len = 0;
        boolean b = true;
        char[] charArr = my_string.toCharArray();
        
        for(char c : charArr) {
            if(c == ' ') b = true;
            else {
                if(b) len++;
                b = false;
            }
        }
        
        answer = new String[len];
        len = 0;
        StringBuffer sb = new StringBuffer();
        
        for(char c : charArr) {
            if(c != ' ') sb.append(c);
            
            if(c == ' ' && sb.length() > 0) {
                answer[len] = sb.toString();
                len++;
                sb = new StringBuffer();
            }
        }
        
        if(sb.length() > 0) answer[len] = sb.toString();
        
        
        return answer;
    }
}