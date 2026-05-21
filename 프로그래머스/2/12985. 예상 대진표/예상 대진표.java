class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        // 최대 경기수 계산
        int n1 = n;
        while(n1 > 1) {
            n1 /= 2;
            answer++;
        }
        
        // 반씩 나누어 같은 조에 속하는지 확인
        int l = 1;
        int h = n;
        while(answer > 1) {
            int m = (l + h) / 2;
            
            // 다른 조에 속하는 경우 현재 최대 경기수만큼 진행됨
            if((a <= m && b > m) || (a > m && b <= m)) break;
            
            // 둘 다 오른쪽 조에 속하는 경우
            if(a > m && b > m) l = m;
            else h = m;
            
            // 같은 조인 경우 최대 경기수 -1
            answer--;
        }

        return answer;
    }
}