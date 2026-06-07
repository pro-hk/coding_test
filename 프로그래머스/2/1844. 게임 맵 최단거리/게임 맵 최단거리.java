import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        
        int lenX = maps[0].length;
        int lenY = maps.length;
        boolean[][] visited = new boolean[lenY + 1][lenX + 1];
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{1, 1, 1});

        while(!queue.isEmpty()) {
            int[] num = queue.poll();
            int x = num[0];
            int y = num[1];
            int cnt = num[2];

            if(visited[x][y]) continue;

            visited[x][y] = true;

            if(x == lenY && y == lenX) answer = answer != -1 && answer < cnt ? answer : cnt;

            // 동쪽으로 이동
            if(y + 1 <= lenX && maps[x - 1][y] == 1) queue.add(new int[]{x, y + 1, cnt + 1});
            // 서쪽으로 이동
            if(0 < y - 1 && maps[x - 1][y - 2] == 1) queue.add(new int[]{x, y - 1, cnt + 1});
            // 남쪽으로 이동
            if(x + 1 <= lenY && maps[x][y - 1] == 1) queue.add(new int[]{x + 1, y, cnt + 1});
            // 북쪽으로 이동
            if(0 < x - 1 && maps[x - 2][y - 1] == 1) queue.add(new int[]{x - 1, y, cnt + 1});
        }
        
        return answer;
    }
}