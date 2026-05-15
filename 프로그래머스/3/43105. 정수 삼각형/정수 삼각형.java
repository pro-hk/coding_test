import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < triangle.length; i++) {
            int len = triangle[i].length;
            for(int j = 0; j < len; j++) {
                int idx = i * 1000 + j;     // 저장할 현재 인덱스
                int num = triangle[i][j];   // 현재 경로의 값
                int prevNum = 0;            // 이전 경로의 값
                if(j == 0) {                // 첫항은 첫항끼리만 더해짐
                    prevNum = i == 0 ? 0 : map.get((i - 1) * 1000);
                } else if (j == len - 1) {  // 마지막항은 마지막항끼리만 더해짐
                    prevNum = map.get((i - 1) * 1000 + j - 1);
                } else {
                    int num1 = map.get((i - 1) * 1000 + j - 1);
                    int num2 = map.get((i - 1) * 1000 + j);
                    prevNum = num1 < num2 ? num2 : num1;
                }
                
                map.put(idx, prevNum + num);
            }
        }
        
        for(int i = 0; i < triangle.length; i++) {
            int idx = (triangle.length - 1) * 1000 + i;
            answer = answer < map.get(idx) ? map.get(idx) : answer;
        }
        
        return answer;
    }
}