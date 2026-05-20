import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        int cnt = 1;
        char last = 0;
        List<String> list = new ArrayList();
        
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            char first = word.charAt(0);
            int len = word.length();
            
            if(i == 0) {
                last = word.charAt(len - 1);
                list.add(word);
                continue;
            }
            
            // 이전에 등장했던 단어 사용한 경우
            if(list.contains(word)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            
            // 이전 단어 마지막과 다른 경우
            if(first != last) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            
            last = word.charAt(len - 1);
            list.add(word);
        }

        return answer;
    }
}