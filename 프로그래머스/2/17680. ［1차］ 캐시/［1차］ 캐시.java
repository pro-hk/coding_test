import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Queue<String> queue = new LinkedList();
        
        for(String city : cities) {
            String s = city.toLowerCase();
            if(queue.contains(s)) {
                queue.remove(s);
                answer += 1;
            } else {
                if(queue.size() < cacheSize) {
                    queue.add(s);
                    answer += 5;
                    continue;
                } else {
                    queue.poll();
                    answer += 5;
                }
            }
            if(cacheSize > 0) queue.add(s);
        }
        
        return answer;
    }
}