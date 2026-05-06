class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean isEven = (n % 2 == 0);
        
        for(int i = n; i > 0; i--) {
            boolean isOdd = (i % 2 == 1); 
            if(isEven && !isOdd) answer += i * i;
            else if(!isEven && isOdd) answer += i;
        }
        
        return answer;
    }
}