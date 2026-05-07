class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int count = 0;
        while(count < included.length) {
            if(included[count]) answer += a + (d * count);
            count++;
        }
        
        return answer;
    }
}