import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);            // 작은 순서대로 정렬
        
        int cnt = 0;                    // 구조된 사람 수
        int min = 0;                    // 현재 남은 사람 중 가장 작은 몸무게 인덱스
        int max = people.length - 1;    // 현재 남은 사람 중 가장 큰 몸무게 인덱스
        
        // 가장 작은 몸무게 사람과 가장 큰 몸무게 사람 같이 구조
        while(cnt < people.length) {
            if(people[min] + people[max] <= limit) {
                min++;
                cnt++;
            }
            max--;
            cnt++;
            answer++;
        }
        
        return answer;
    }
}