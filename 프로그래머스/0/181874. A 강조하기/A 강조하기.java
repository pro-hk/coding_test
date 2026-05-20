class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char[] charArr = myString.toLowerCase().toCharArray();
        
        StringBuffer sb = new StringBuffer();
        for(char c : charArr) {
            if(c == 'a') c = 'A';
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}