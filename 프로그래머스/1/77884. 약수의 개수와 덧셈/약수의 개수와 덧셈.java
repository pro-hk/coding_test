class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            int cnt = 0;
            int num = i;
            
            while(num > 0) {
                if(i % num == 0) cnt++;
                num--;
            }
            
            answer += cnt % 2 == 0 ? i : -i;
        }
        
        return answer;
    }
}