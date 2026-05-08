class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            int num = -1; // k 보다 큰 값
            int k = queries[i][2];
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                int e = arr[j];
                if(e > k) {
                    if(num == -1) num = e;
                    else num = num < e ? num : e;
                }
            }
            answer[i] = num;
        }
        
        return answer;
    }
}