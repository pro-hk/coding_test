import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        // 정확한 이유는 모르겠지만 2진법의 1의 갯수와 동일할거같음
        while(n > 0) {
            if(n % 2 == 1) ans++;
            n /= 2;
        }

        return ans;
    }
}