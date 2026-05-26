class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        boolean b = false;
        StringBuilder sb = new StringBuilder();
        char[] charArr = n_str.toCharArray();
        for(char c : charArr) {
            if(c != '0') b = true;
            if(b) sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}