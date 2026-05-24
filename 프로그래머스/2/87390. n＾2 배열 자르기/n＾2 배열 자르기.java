class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = {};
        
        // 2차원 배열에 값 채우기
        /* n*n 할 때 메모리 초과 오류 발생한다고 함
        int[][] arr2 = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int max = i < j ? j : i;
                arr2[i][j] = max + 1;
            }
        }
        */
        
        // 새로운 1차원 배열 생성시 바로 값 구하기
        int idx = 0;
        answer = new int[(int) (right - left + 1)];
        for(long k = left; k <= right; k++) {
            int i = (int) (k / n);
            int j = (int) (k % n);
            int max = i < j ? j : i;
            answer[idx] = max + 1;
            idx++;
        }
        
        return answer;
    }
}