class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        
        answer = new int[k];
        answer[0] = arr[0];
        
        int cnt = 1;
        for(int i : arr) {
            int idx = -1;
            for(int j : answer) {
                if(i == j) {
                    idx = j;
                    break;
                } 
            }
            
            if(idx == -1) {
                answer[cnt] = i;
                cnt++;
            }
            
            if(cnt == k) break;
        }
        
        while(cnt < k) {
            answer[cnt] = -1;
            cnt++;
        }
        
        return answer;
    }
}