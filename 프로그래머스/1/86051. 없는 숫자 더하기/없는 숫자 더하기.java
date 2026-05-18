import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int idx = 0;
        for(int i = 0; i < 10; i++) {
            if(idx == numbers.length && i > numbers.length) {
                answer += i;
                continue;
            }
            
            if(i < numbers[idx]) answer += i;
            else idx++;
        }
        
        return answer;
    }
}