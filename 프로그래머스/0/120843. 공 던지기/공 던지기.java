class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int idx = 0;
        int cnt = 1;
        while(cnt < k) {
            idx = (idx + 2);
            cnt++;
        }
        
        answer = numbers[idx % numbers.length];
        
        return answer;
    }
}