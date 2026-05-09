class Solution {
    public int solution(int n) {
        int answer = 0;
        
        /* 효율성 테스트3 실패
        int n1 = n;
        int c1 = 0; // 2진법 변환시 1의 개수
        while(n1 > 0) {
            if(n1 % 2 == 1) c1++;
            n1 /= 2;
        }
        
        int c2 = 0; // 2진법 변환시 1의 개수
        int c3 = 0; // 더해진 개수
        
        while(c1 != c2) {
            c3++;
            c2 = 0;
            int n2 = n + c3;
            while(n2 > 0) {
                if(n2 % 2 == 1) c2++;
                n2 /= 2;
            }
        }
        
        answer = n + c3;
        */
        
        // 검색시 Integer.bitCount(n) 함수로 1의 개수 확인 가능
        int c1 = Integer.bitCount(n);
        int c2 = 0;
        
        while(c1 != c2) {
            n++;
            c2 = Integer.bitCount(n);
        }
        
        answer = n;
        
        return answer;
    }
}