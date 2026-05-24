class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        
        int len = arr.length;
        answer = new int[len];
        boolean b1 = arr.length % 2 == 1;
        
        for(int i = 0; i < len; i++) {
            boolean b2 = i % 2 == 0;
            if((b1 && b2) || (!b1 && !b2)) answer[i] = arr[i] + n;
            else answer[i] = arr[i];
        }
        
        return answer;
    }
}