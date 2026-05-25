class Solution {
    public String solution(String s) {
        String answer = "";
        
        int len = s.length();
        int mid = len / 2;
        
        StringBuilder sb = new StringBuilder();
        if(len % 2 == 0) sb.append(s.charAt(mid - 1));
        sb.append(s.charAt(mid));
        
        answer = sb.toString();
        
        return answer;
    }
}