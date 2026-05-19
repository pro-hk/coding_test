class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        boolean len = num_list.length <= 10;
        if(len) answer = 1;
        
        for(int i : num_list) {
            if(len) answer *= i;
            else answer += i;
        }
        
        return answer;
    }
}