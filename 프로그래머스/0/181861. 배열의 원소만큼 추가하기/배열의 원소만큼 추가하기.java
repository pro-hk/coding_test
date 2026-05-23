class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int len = 0;
        for(int i : arr) {
            len += i;
        }
        
        answer = new int[len];
        len = 0;
        int max = 0;
        
        for(int i : arr) {
            max += i;
            for(int j = len; j < max; j++) {
                answer[j] = i;
                len++;
            }
        }
        
        return answer;
    }
}