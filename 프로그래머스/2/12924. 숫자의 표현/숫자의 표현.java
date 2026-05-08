class Solution {
    public int solution(int n) {
        int answer = n % 2; // 홀수인 경우 중간값 2개로 가능
        
        for(int i = 2; i <= n; i++) {
            // i가 약수이면서 다른 약수가 홀수인 경우
            if(n % i == 0 && (n / i) % 2 == 1) {
                answer++;
            }
        }
        
        return answer;
    }
}