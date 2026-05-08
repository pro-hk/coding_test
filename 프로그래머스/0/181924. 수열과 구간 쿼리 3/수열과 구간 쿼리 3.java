class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int a = 0; a < queries.length; a++) {
            int i = queries[a][0];
            int j = queries[a][1];
            int k = arr[i]; // 값 바꾸기 전에 미리 할당
            arr[i] = arr[j];
            arr[j] = k;
        }
        
        answer = arr;
        
        return answer;
    }
}