class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        
        answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            int num = k % 2 == 1 ? arr[i] * k : arr[i] + k;
            answer[i] = num;
        }
        
        return answer;
    }
}