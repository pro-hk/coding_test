class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int min = -1;
        int max = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                min = min == -1 ? i : min;
                max = i;
            }
        }
        
        if(min == -1) return new int[]{-1};
        
        answer = new int[max - min + 1];
        int idx = 0;
        for(int i = min; i <= max; i++) {
            answer[idx] = arr[i];
            idx++;
        }
        
        return answer;
    }
}