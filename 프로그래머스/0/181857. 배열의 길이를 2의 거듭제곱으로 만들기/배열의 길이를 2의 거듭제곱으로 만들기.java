class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int cnt = 0;
        int len = arr.length;
        while(len > 1) {
            cnt++;
            
            int min = (int) Math.pow(2, cnt - 1);
            int max = (int) Math.pow(2, cnt);
            
            if(min < len && len <= max) break;
        }
        
        answer = new int[(int) Math.pow(2, cnt)];
        
        for(int i = 0; i < len; i++) {
            if(i < len) answer[i] = arr[i];
            else answer[i] = 0;
        }
        
        return answer;
    }
}