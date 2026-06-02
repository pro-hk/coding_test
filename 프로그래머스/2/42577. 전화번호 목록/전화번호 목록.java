import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
        /* 효율성 시간 초과
        for(int i = 0; i < phone_book.length; i++) {
            String s1 = phone_book[i];
            int len1 = s1.length();
            for(int j = 0; j < phone_book.length; j++) {
                String s2 = phone_book[j];
                int len2 = s2.length();
                
                // 같은 번호면 지나감
                if(i == j) continue;
                
                // if(s1.equals(s2.substring(0, len1))) {
                if(s2.indexOf(s1) == 0) {
                    answer = false;
                    break;
                }
            }
            if(!answer) break;
        }
        */
        
        for(int i = 0; i < phone_book.length - 1; i++) {
            String s1 = phone_book[i];
            String s2 = phone_book[i + 1];
            
            if(s1.length() > s2.length()) continue;
            
            if(s2.indexOf(s1) == 0) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}