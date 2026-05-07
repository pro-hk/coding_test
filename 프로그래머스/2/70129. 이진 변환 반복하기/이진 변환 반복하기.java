class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        char[] c = s.toCharArray();
        int cnt1 = 0; // 이진 변환 개수
        int cnt2 = 0; // 삭제된 0 개수
        int cnt3 = 0; // 남은 1의 개수
        
        while(c.length > 1) {
            // 0, 1 개수 확인
            for(int i = 0; i < c.length; i++) {
                if(c[i] == '0') cnt2++;
                else cnt3++;
            }
            
            int cnt4 = 0; // 이진 변환시 길이
            int tmp = cnt3;
            while(tmp > 0) {
                tmp /= 2;
                cnt4++;
            }
            
            // 이진 변환
            c = new char[cnt4];
            for(int i = cnt4; i > 0; i--) {
                c[i - 1] = (char) (cnt3 % 2 + '0');
                cnt3 /= 2;
            }
            
            cnt1++;
        }
        
        answer = new int[2];
        answer[0] = cnt1;
        answer[1] = cnt2;
        
        return answer;
    }
}