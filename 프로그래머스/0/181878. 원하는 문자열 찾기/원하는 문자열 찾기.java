class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        int len1 = myString.length();
        int len2 = pat.length();
        
        if(len1 == len2 && myString.equals(pat)) answer = 1;
        
        if(len1 > len2) {
            answer = myString.indexOf(pat) > -1 ? 1 : 0;
        }
        
        return answer;
    }
}