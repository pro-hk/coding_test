class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        char[] c = phone_number.toCharArray();
        
        for(int i = 0; i < c.length; i++) {
            if(i < c.length - 4) sb.append("*");
            else sb.append(c[i]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}