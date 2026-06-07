import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = {};
        
        answer = new int[emergency.length];
        int[] sortArr = emergency.clone();
        Arrays.sort(sortArr);
        int rank = emergency.length;
        for(int i : sortArr) {
            for(int j = 0; j < emergency.length; j++) {
                if(i == emergency[j]) {
                    answer[j] = rank;
                    rank--;
                    continue;
                }
            }
        }
        
        return answer;
    }
}