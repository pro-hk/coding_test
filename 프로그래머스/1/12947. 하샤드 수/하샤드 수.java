class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int len = (int) Math.log10(x);
        int x1 = x;
        int sum = 0;
        
        for(int i = 0; i <= len; i++) {
            sum += x1 % 10;
            x1 /= 10;
        }
        
        answer = x % sum == 0;
        
        return answer;
    }
}