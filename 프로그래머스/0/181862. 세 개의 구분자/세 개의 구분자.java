class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        char[] charArr = myStr.toCharArray();
        int len = 0;
        boolean b = false;
        for(int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            if(c == 'a' || c == 'b' || c == 'c') {
                if(b) len++;
                b = false;
            } else {
                b = true;
            }
        }
        
        if(b) len++;
        
        if(len == 0) return new String[]{"EMPTY"};
        
        answer = new String[len];
        len = 0;
        b = false;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            if(c == 'a' || c == 'b' || c == 'c') {
                if(b) {
                    answer[len] = sb.toString();
                    sb.setLength(0);
                    len++;
                }
                b = false;
            } else {
                sb.append(c);
                b = true;
            }
        }
        
        if(b) answer[len] = sb.toString();
        
        return answer;
    }
}