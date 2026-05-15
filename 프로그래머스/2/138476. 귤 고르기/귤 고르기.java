import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // tangerine 크기별로 정렬
        Arrays.sort(tangerine);
        
        // 크기가 다른 귤 종류 계산
        int cnt = 0;
        int num = 0;
        for(int i : tangerine) {
            if(num < i) {
                num = i;
                cnt++;
            }
        }
        
        // 크기별 귤 수량 계산
        int[] qty = new int[cnt];
        int idx = 0;
        cnt = 0;
        for(int i = 0; i < tangerine.length; i++) {
            if(i == 0) num = tangerine[i];
            
            if(num == tangerine[i]) {
                cnt++;
            } else {
                num = tangerine[i];
                qty[idx] = cnt;
                cnt = 1;
                idx++;
            }
            
            if(i == tangerine.length - 1) qty[idx] = cnt;
        }
        
        // 수량 작은 순서대로 정렬
        Arrays.sort(qty);
        
        int sum = 0;
        for(int i = qty.length - 1; i >= 0; i--) {
            sum += qty[i];
            answer++;
            if(sum >= k) break;
        }
        
        return answer;
    }
}