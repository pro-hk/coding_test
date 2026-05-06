class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        int len = 1;
        long n1 = n;
        
        while(n1 > 10) {
            n1 = n1 / 10;
            len++;
        }
        
        answer = new int[len];
        
        long n2 = n;
        for(int i = 0; i < len; i++) {
            answer[i] = (int) (n2 % 10);
            n2 = n2 / 10;
        }
        
        return answer;
    }
}