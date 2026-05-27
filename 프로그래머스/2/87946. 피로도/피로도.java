class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        
        boolean[] visited = new boolean[dungeons.length];
        answer = exp(k, dungeons, visited, 0);
        
        return answer;
    }
    
    public int exp(int fp, int[][] dungeons, boolean[] visited, int cnt) {
        int ret = cnt;
        for(int i = 0; i < dungeons.length; i++) {
            //  이미 방문한 던전이거나 남은 피로도가 필요 피로도 보다 작은 경우
            if(visited[i] || fp < dungeons[i][0]) continue;
            
            visited[i] = true;
            
            ret = Math.max(ret, exp(fp - dungeons[i][1], dungeons, visited, cnt + 1));
            
            visited[i] = false;
            
            // 던전을 다 돈 경우 종료
            if(ret == dungeons.length) break;
        }
        
        return ret;
    }
}