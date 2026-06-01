class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        int len = n / 2 + (n % 2 == 0 ? 0 : 1);
        answer = new int[len];
        
        int idx = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                answer[idx] = i;
                idx++;
            }
        }
        
        return answer;
    }
}