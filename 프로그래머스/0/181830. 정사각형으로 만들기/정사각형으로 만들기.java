class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        
        int r = arr.length;
        int c = arr[0].length;
        int max = Math.max(r, c);
        answer = new int[max][max];
        
        for(int i = 0; i < max; i++) {
            for(int j = 0; j < max; j++) {
                if(i < r && j < c) {
                    answer[i][j] = arr[i][j];
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        
        return answer;
    }
}