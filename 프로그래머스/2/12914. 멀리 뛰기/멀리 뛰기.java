import java.math.*;

class Solution {
    public long solution(int n) {
        long answer = 0;
        
        int d = n / 2;  // 2칸씩 뛰는 최대 횟수
        
        for(int i = 0; i <= d; i++) {   // i : 2칸씩 뛰는 횟수
            int n1 = n - (i * 2) + i;   // 1칸 + 2칸 개수
            int r = i > n1 / 2 ? n1 - i : i;
            BigInteger b0 = new BigInteger("0");
            BigInteger b1 = new BigInteger("1");
            BigInteger b2 = new BigInteger("1");
            BigInteger b3 = new BigInteger("1234567");

            // n1Pr (n1개 중 r개를 나열하는 방법의 수)
            for(int j = 0; j < r; j++) {
                b1 = b1.multiply(BigInteger.valueOf(n1 - j));
                b2 = b2.multiply(BigInteger.valueOf(j + 1));

                if(b1.remainder(b2) == b0) {
                    b1 = b1.divide(b2);
                    b2 = b2.divide(b2);
                }
            }
            answer += b1.divide(b2).remainder(b3).longValue();
        }
        answer %= 1234567;
        
        return answer;
    }
}