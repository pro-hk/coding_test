class Solution {
    public String solution(String code) {
        String answer = "";
        
        boolean mode = false;
        
        char[] chars = code.toCharArray();
        
        for(int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c == '1') {
                mode = !mode;
            } else {
                if(!mode && i % 2 == 0){
                    answer += c;
                } else if (mode && i % 2 == 1) {
                    answer += c;
                }
            }
        }
        
        if(answer.equals("")) answer = "EMPTY";
        
        return answer;
    }
}