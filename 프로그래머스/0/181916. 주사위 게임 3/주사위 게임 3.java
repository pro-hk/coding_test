import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        
        boolean a1 = (arr[0] == arr[1]);
        boolean a2 = (arr[1] == arr[2]);
        boolean a3 = (arr[2] == arr[3]);
        
        if(a1 && a2 && a3) answer = 1111 * arr[0];
        else if(a1 && a2) answer = (int) Math.pow(10 * arr[0] + arr[3], 2);
        else if(a2 && a3) answer = (int) Math.pow(10 * arr[3] + arr[0], 2);
        else if(a1 && a3) answer = (arr[0] + arr[3]) * (arr[3] - arr[0]);
        else if(a1) answer = arr[2] * arr[3];
        else if(a2) answer = arr[3] * arr[0];
        else if(a3) answer = arr[0] * arr[1];
        else answer = arr[0];
        
        return answer;
    }
}