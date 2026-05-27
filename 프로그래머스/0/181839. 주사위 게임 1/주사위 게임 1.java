class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        boolean A = a % 2 == 1;
        boolean B = b % 2 == 1;
        
        if(A && B) answer = a * a + b * b;
        else if(!A && !B) answer = Math.abs(a - b);
        else answer = 2 * (a + b);
        
        return answer;
    }
}