class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int j = hp / 5;
        int b = (hp % 5) / 3;
        int i = (hp % 5) % 3;
        
        answer = j + b + i;
        
        return answer;
    }
}