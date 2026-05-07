class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int odd = 0;
        int even = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            int num = num_list[i];
            if(num % 2 == 0) even = even * 10 + num;
            else odd = odd * 10 + num;
        }
        
        answer = odd + even;
        
        return answer;
    }
}