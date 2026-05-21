class Solution {
    public int solution(int num) {
        int answer = 0;
        
        long l = num;
        while(l > 1) {
            answer++;
            l = l % 2 == 0 ? l / 2 : l * 3 + 1;
            if(answer == 500) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}