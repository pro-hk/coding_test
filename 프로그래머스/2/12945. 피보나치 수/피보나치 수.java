class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int n0 = 0;
        int n1 = 1;
        int c = 2;
        int d = 1234567;
        
        while(c <= n) {
            answer = n0 + n1;
            if(c % 2 == 0) {
                n0 += n1;
                n0 %= d;
            } else {
                n1 += n0;
                n1 %= d;
            }
            c++;
        }
        answer %= d;
        
        return answer;
    }
}