class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        
        int ame = 5500;
        answer = new int[2];
        
        answer[0] = money / ame;
        answer[1] = money % ame;
        
        return answer;
    }
}