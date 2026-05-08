class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
             
        int len = num_list.length;
        int num1 = num_list[len - 2];
        int num2 = num_list[len - 1];
        int last = num1 < num2 ? num2 - num1 : num2 * 2;
        
        answer = new int[len + 1];
        
        for(int i = 0; i < len + 1; i++) {
            answer[i] = i < len ? num_list[i] : last;
        }
        
        return answer;
    }
}