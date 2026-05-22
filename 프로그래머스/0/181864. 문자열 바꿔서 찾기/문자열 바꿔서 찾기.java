class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        StringBuffer sb = new StringBuffer();
        char[] charArr = myString.toCharArray();
        
        for(char c : charArr) {
            if(c == 'A') sb.append('B');
            else sb.append('A');
        }
        
        if(sb.indexOf(pat) > -1) answer = 1; 
        
        return answer;
    }
}