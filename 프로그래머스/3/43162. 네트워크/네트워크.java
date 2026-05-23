import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack();
        
        /*
        stack.push(0);
        
        while(!stack.isEmpty()) {
            int vertex = stack.pop();
            
            if(visited[vertex]) continue;
            
            visited[vertex] = true;
            
            for(int i = 0; i < n; i++) {
                if(!visited[i] && computers[vertex][i] == 1) stack.push(i);
            }
            
            // 방문하지 않은 노드 찾기
            if(stack.isEmpty()) {
                for(int i = 0; i < n; i++) {
                    if(!visited[i]) {
                        stack.push(i);
                        answer++;
                        break;
                    }
                }
            }
        }
        */
        // 1. 모든 노드를 순서대로 확인하면서 새로운 네트워크의 시작점을 찾습니다.
        for(int start = 0; start < n; start++) {
            // 이미 다른 네트워크 탐색 때 방문했다면 건너뜁니다.
            if(visited[start]) continue;

            // 방문하지 않은 새로운 노드를 찾았다면 새로운 네트워크 발견!
            answer++;
            stack.push(start);

            // 2. 이 연결고리가 끝날 때까지만 내부에서 DFS를 돌립니다.
            while(!stack.isEmpty()) {
                int vertex = stack.pop();

                if(visited[vertex]) continue;
                visited[vertex] = true;

                for(int i = 0; i < n; i++) {
                    if(!visited[i] && computers[vertex][i] == 1) {
                        stack.push(i);
                    }
                }
            } // 한 네트워크의 탐색이 완벽히 종료됨
        }
        
        return answer;
    }
}