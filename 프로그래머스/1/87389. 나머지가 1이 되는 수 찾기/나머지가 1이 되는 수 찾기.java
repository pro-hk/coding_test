class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 홀수인 경우 무조건 2
        if(n % 2 == 1) return 2;
        
        // 짝수인 경우 n-1의 약수 중 가장 작은 수(1 제외)
        int num = 3;
        while(true) {
            if((n - 1) % num == 0) break;
            num++;
        }
        
        answer = num;
        
        return answer;
    }
}