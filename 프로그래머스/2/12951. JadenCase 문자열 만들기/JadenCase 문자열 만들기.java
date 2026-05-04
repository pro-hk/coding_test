class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        String[] words = s.split(" ");
        
        for(int i = 0; i < words.length; i++) {
            // 공백문자 연속인 경우
            if(words[i].length() == 0) {
                answer += " ";
                continue;
            }
            
            String word = words[i];
            String first = word.substring(0, 1).toUpperCase();

            answer += first + word.substring(1) + ((i < words.length - 1) ? " " : "");
        }
        
        // 마지막 글자 뒤에 빈칸이 있는 경우
        if(answer.length() != s.length()) {
            for(int i = answer.length(); i < s.length(); i++) {
                answer += " ";
            }
        }
        
        return answer;
    }
}