class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        for(int i = 0; i < 3; i++) {
            int d1 = date1[i];
            int d2 = date2[i];
            
            if(d1 < d2) {
                answer = 1;
                break;
            } else if(d1 > d2) {
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
}