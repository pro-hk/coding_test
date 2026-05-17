class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        int len = num_list.length;
        
        answer = new int[len];
        
        int idx = 0;
        // n 이후 값들 먼저 삽입
        for(int i = n; i < len; i++) {
            answer[idx] = num_list[i];
            idx++;
        }
        
        // n 이전 값들 삽입
        for(int i = 0; i < n; i++) {
            answer[idx] = num_list[i];
            idx++;
        }
        
        return answer;
    }
}