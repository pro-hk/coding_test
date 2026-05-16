class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        
        for(int i = 0; i < query.length; i++) {
            int idx = query[i];
            int len = answer.length;
            int[] tmpArr = new int[i % 2 == 0 ? idx + 1 : len - idx];
            for(int j = 0; j < len; j++) {
                if(i % 2 == 0) {
                    if(j <= idx) tmpArr[j] = answer[j];
                } else {
                    if(j >= idx) tmpArr[j - idx] = answer[j];
                }
            }
            answer = tmpArr;
        }
        
        return answer;
    }
}