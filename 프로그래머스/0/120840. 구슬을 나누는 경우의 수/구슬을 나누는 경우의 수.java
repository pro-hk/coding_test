class Solution {
    public int solution(int balls, int share) {
        int answer = 1;
        
        int min = Math.min(share, balls - share);
        int cnt = 1;
        long l = 1;
        
        while(cnt <= min) {
            l *= balls;
            l /= cnt;
            balls--;
            cnt++;
        }
        
        answer = (int) l;
        
        return answer;
    }
}