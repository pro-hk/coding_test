class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        int len = num_list.length;
        answer = new int[1 + (len - 1) / n];
        
        int idx = 0;
        for(int i = 0; i < len; i++) {
            if(i % n == 0) {
                answer[idx] = num_list[i];
                idx++;
            }
        }
        
        return answer;
    }
}