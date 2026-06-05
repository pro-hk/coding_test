class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        
        int[] nArr = new int[n + 1];
        int[] mArr = new int[m + 1];
        
        nArr[1] = 1;
        mArr[1] = 1;
        
        int idx = 2;
        int n1 = n;
        while(n1 > 1) {
            if(n1 % idx == 0) {
                nArr[idx]++;
                n1 /= idx;
            } else {
                idx++;
            }
        }
        
        idx = 2;
        int m1 = m;
        while(m1 > 1) {
            if(m1 % idx == 0) {
                mArr[idx]++;
                m1 /= idx;
            } else {
                idx++;
            }
        }
        
        answer = new int[]{1, 1};
        for(int i = 2; i <= Math.max(n, m); i++) {
            if(i <= n && i <= m && nArr[i] > 0 && mArr[i] > 0) {
                answer[0] *= Math.pow(i, Math.min(nArr[i], mArr[i]));
                answer[1] *= Math.pow(i, Math.max(nArr[i], mArr[i]));
            } else if(i <= n && nArr[i] > 0) {
                answer[1] *= Math.pow(i, nArr[i]);
            } else if(i <= m && mArr[i] > 0) {
                answer[1] *= Math.pow(i, mArr[i]);
            }
        }
        
        return answer;
    }
}