class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        char[] charArr = s.toCharArray();
        
        if(charArr.length != 4 && charArr.length != 6) return false;
        
        for(char c : charArr) {
            if(c - '9' > 0) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}