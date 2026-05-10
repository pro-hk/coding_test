class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        double len = arr.length;
        for(int i = 0; i < len; i++) {
            answer += (double) arr[i];
        }
        
        answer /= len;
        
        return answer;
    }
}