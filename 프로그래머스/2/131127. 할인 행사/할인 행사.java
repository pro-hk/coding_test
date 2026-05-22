class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        int day = 0;
        int[] cnt = new int[number.length];
        
        while(true) {
            for(int i = day; i < day + 10; i++) {
                int idx = -1;
                // 할인 제품이 원하는 제품인지 체크
                for(int j = 0; j < want.length; j++) {
                    if(discount[i].equals(want[j])) {
                        idx = j;
                        cnt[j]++;
                        break;
                    }
                }
                
                // 원하는 제품이 아니거나 원하는 수량 넘어가면 중지
                if(idx < 0 || cnt[idx] > number[idx]) break;
                
                if(i == day + 9) answer++;
            }
            day++;
            cnt = new int[number.length];
            
            // 10건 미만으로 남으면 중지
            if((discount.length - day) < 10) break;
        }
        
        return answer;
    }
}