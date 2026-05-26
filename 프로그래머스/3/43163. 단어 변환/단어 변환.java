import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList();
        boolean[] visited = new boolean[words.length];
        Map<String, Integer> map = new HashMap();   // String과 depth 저장
        
        int depth = 1;              // 현재 바뀐 횟수
        boolean check = false;      // 다음 단어가 target인지 확인
        String prevWord = begin;
        queue.add(-1);
        
        while(!queue.isEmpty()) {
            int vertex = queue.poll();
            
            if(vertex > -1) {
                if(visited[vertex]) continue;
                
                visited[vertex] = true;
                prevWord = words[vertex];
                depth = map.get(prevWord) + 1;
            }
            
            char[] prevArr = prevWord.toCharArray();
            
            for(int i = 0; i < words.length; i++) {
                String nextWord = words[i];
                char[] nextArr = nextWord.toCharArray();
                int cnt = 0;
                
                for(int j = 0; j < nextArr.length; j++) {
                    if(prevArr[j] == nextArr[j]) cnt++;
                }
                
                if(cnt >= nextArr.length - 1 && !visited[i]) {
                    queue.add(i);
                    map.put(nextWord, depth);
                    if(target.equals(nextWord)) check = true;
                }
            }
            if(check) {
                answer = depth;
                break;
            }
        }
        
        return answer;
    }
}