class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int len = num_list.length;
        answer = new int[len];
        
        for(int i : num_list) {
            answer[len - 1] = i;
            len--;
        }
        
        return answer;
    }
}