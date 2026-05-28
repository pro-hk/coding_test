class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        
        answer = new String[picture.length * k];
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        
        for(String s : picture) {
            char[] charArr = s.toCharArray();
            for(char c : charArr) {
                for(int i = 0; i < k; i++) {
                    sb.append(c);
                }
            }
            
            for(int i = cnt; i < cnt + k; i++) {
                answer[i] = sb.toString();
            }
            cnt += k;
            sb.setLength(0);
        }
        
        return answer;
    }
}