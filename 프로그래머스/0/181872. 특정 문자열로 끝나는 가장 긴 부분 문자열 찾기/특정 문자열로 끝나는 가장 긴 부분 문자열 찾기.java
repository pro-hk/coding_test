class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        int len = pat.length();
        
        while(myString.indexOf(pat) > -1) {
            int idx = myString.indexOf(pat) + len;
            sb.append(myString.substring(0, idx));
            myString = myString.substring(idx);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}