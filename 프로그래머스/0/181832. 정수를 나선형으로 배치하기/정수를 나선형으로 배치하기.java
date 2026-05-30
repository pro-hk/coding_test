class Solution {
    public int[][] solution(int n) {
        int[][] answer = {};
        
        answer = new int[n][n];
        
        int minR = 0;
        int minC = 0;
        int maxR = n;
        int maxC = n;
        int num = 1;
        int cnt = 1;
        
        while(num <= n * n) {
            switch(cnt % 4) {
                case 0 : 
                    for(int i = maxR - 1; i >= minR; i--) {
                        answer[i][minC] = num;
                        num++;
                    }
                    minC++;
                    cnt++;
                    break;
                case 1 : 
                    for(int i = minC; i < maxC; i++) {
                        answer[minR][i] = num;
                        num++;
                    }
                    minR++;
                    cnt++;
                    break;
                case 2 : 
                    for(int i = minR; i < maxR; i++) {
                        answer[i][maxC - 1] = num;
                        num++;
                    }
                    maxC--;
                    cnt++;
                    break;
                case 3 : 
                    for(int i = maxC - 1; i >= minC; i--) {
                        answer[maxR - 1][i] = num;
                        num++;
                    }
                    maxR--;
                    cnt++;
                    break;
            }
        }
        
        return answer;
    }
}