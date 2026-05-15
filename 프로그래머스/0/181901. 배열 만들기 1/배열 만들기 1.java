class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        
        int len = n / k;
        answer = new int[len];
        
        int idx = 0;
        for(int i = k; i <= n; i++) {
            if(i % k == 0) {
                answer[idx] = i;
                idx++;
            }
        }
        
        return answer;
    }
}