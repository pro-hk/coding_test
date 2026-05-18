class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr;
        
        for(int i = 0; i < answer.length; i++) {
            int num = answer[i];
            if(num >= 50 && num % 2 == 0) answer[i] = num / 2;
            if(num < 50 && num % 2 == 1) answer[i] = num * 2;
        }
        
        return answer;
    }
}