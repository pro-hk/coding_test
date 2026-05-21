class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        while(myString.indexOf(pat) > -1) {
            int idx = myString.indexOf(pat);
            myString = myString.substring(idx + 1);
            answer++;
        }
        
        return answer;
    }
}