class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        int w = 0;  // 가로
        int h = 0;  // 세로
        boolean t = false; 
        
        for(int i = 1; i <= yellow / 2; i++) {
            if(yellow % i == 0) {
                h = i + 2;
                w = yellow / i + 2;
                
                t = h * w - yellow == brown;
                if(t) break;
            }
        }
        
        if(yellow == 1) {
            w = 3;
            h = 3;
        }
        
        answer = new int[]{w, h};
        
        return answer;
    }
}