class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char[] charArr = myString.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : charArr) {
            if(c < 'l') c = 'l';
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}