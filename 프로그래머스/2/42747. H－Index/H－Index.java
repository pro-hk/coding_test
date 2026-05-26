class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        int h = citations.length;
        
        while(h > 0) {
            int over = 0;
            for(int i : citations) {
                if(i >= h) over++;
            }
            
            if(over >= h) break;
            
            h--;
        }
        
        answer = h;
        
        return answer;
    }
}