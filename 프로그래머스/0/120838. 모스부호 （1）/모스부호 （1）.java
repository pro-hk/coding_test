class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[][] morse = {{".-","a"}, {"-...","b"}, {"-.-.","c"}, {"-..","d"}, {".","e"},
                            {"..-.","f"}, {"--.","g"}, {"....","h"}, {"..","i"}, {".---","j"},
                            {"-.-","k"}, {".-..","l"}, {"--","m"}, {"-.","n"}, {"---","o"},
                            {".--.","p"}, {"--.-","q"}, {".-.","r"}, {"...","s"}, {"-","t"},
                            {"..-","u"}, {"...-","v"}, {".--","w"}, {"-..-","x"}, {"-.--","y"}, 
                            {"--..","z"}};
        
        String[] words = letter.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            for(String[] m : morse) {
                if(m[0].equals(word)) {
                    sb.append(m[1]);
                    break;
                }
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}