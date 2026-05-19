import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        
        int[] arr1 = arr;
        int[] arr2 = new int[arr.length];
        while(!Arrays.equals(arr1, arr2)) {
            answer++;
            boolean b = answer % 2 == 0;
            for(int i = 0; i < arr1.length; i++) {
                int num = b ? arr1[i] : arr2[i];
                if(num >= 50 && num % 2 == 0) {
                    if(b) arr2[i] = num / 2;
                    else arr1[i] = num / 2;
                }
                else if(num < 50 && num % 2 == 1) {
                    if(b) arr2[i] =  num * 2 + 1;
                    else arr1[i] =  num * 2 + 1;
                } else {
                    if(b) arr2[i] =  num;
                    else arr1[i] =  num;
                }
            }
        }
        
        return answer;
    }
}