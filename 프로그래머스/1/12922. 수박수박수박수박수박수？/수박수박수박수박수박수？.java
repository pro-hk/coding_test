class Solution {
    public String solution(int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            char c = i % 2 == 1 ? '수' : '박';
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}