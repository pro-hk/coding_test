class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        char[] charArr = rny_string.toCharArray();
        
        for(char c : charArr) {
            if(c == 'm') sb.append("rn");
            else sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}