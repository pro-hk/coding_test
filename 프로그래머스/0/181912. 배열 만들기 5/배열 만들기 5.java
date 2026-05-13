class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        
        int cnt = 0;
        for(int i = 0; i < intStrs.length; i++) {
            String num = intStrs[i].substring(s, s + l);
            if(Integer.parseInt(num) > k) {
                cnt++;
            } else {
                num = "0";
            }
            intStrs[i] = num;
        }

        answer = new int[cnt];
        cnt = 0;
        for(int i = 0; i < intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i]);
            if(num > k) {
                answer[cnt] = num;
                cnt++;
            }
        }
        
        return answer;
    }
}