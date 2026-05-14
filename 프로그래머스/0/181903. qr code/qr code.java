class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        
        int idx = r;
        
        while(idx < code.length()) {
            sb.append(code.charAt(idx));
            idx += q;
        }
        
        answer = sb.toString();
        
        return answer;
    }
}