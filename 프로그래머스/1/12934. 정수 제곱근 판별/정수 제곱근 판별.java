class Solution {
    public long solution(long n) {
        long answer = -1;
        
        long d = (long) Math.sqrt(n);
        
        if((long) Math.pow(d, 2) == n) answer = (long) Math.pow(d + 1, 2);
        
        return answer;
    }
}