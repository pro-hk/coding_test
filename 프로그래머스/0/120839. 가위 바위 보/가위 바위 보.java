class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        char[] charArr = rsp.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char c : charArr) {
            if(c == '2') sb.append('0');
            else if(c == '0') sb.append('5');
            else sb.append('2');
        }
        
        answer = sb.toString();
        
        return answer;
    }
}