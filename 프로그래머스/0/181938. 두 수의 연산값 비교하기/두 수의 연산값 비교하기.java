class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        answer = Integer.parseInt(""+a+b);
        int ab2 = 2 * a * b;
        
        if(answer < ab2) answer = ab2;
        
        return answer;
    }
}