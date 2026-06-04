class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        char[] charArr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char c : charArr) {
            for(int i = 0; i < n; i++) {
                sb.append(c);
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}