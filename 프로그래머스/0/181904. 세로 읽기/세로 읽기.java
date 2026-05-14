class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        int idx = my_string.length() / m;
        
        for(int i = 0; i < idx; i++) {
            String s = my_string.substring(m * i, m * (i + 1));
            sb.append(s.charAt(c - 1));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}