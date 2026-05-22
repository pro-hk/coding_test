class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        
        char[] charArr = myString.toCharArray();
        
        int idx = 1;
        for(char c : charArr) {
            if(c == 'x') idx++;
        }
        
        answer = new int[idx];
        
        idx = 0;
        int cnt = 0;
        for(char c : charArr) {
            if(c != 'x') cnt++; 
            else {
                answer[idx] = cnt;
                idx++;
                cnt = 0;
            }
        }
        
        answer[idx] = cnt;
        
        return answer;
    }
}