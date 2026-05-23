class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int min = arr[0];
        
        for(int i : arr) {
            if(i < min) min = i;
        }
        
        int idx = 0;
        answer = new int[arr.length - 1];
        for(int i : arr) {
            if(i == min) continue;
            
            answer[idx] = i;
            idx++;
        }
        
        if(answer.length == 0) answer = new int[]{-1};
        
        return answer;
    }
}