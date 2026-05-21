class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        int cnt = 0;
        for(String s : strArr) {
            if(s.indexOf("ad") < 0) cnt++;
        }
        
        answer = new String[cnt];
        cnt = 0;
        for(String s : strArr) {
            if(s.indexOf("ad") < 0) {
                answer[cnt] = s;
                cnt++;
            }
        }
        
        return answer;
    }
}