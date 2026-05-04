class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        answer =  Integer.parseInt((String.valueOf(a) + String.valueOf(b)));
        int plus =  Integer.parseInt((String.valueOf(b) + String.valueOf(a)));
        
        if(answer < plus) answer = plus;
        
        return answer;
    }
}