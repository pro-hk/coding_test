import java.util.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len = Math.max(len1, len2);
        int ten = 0;
        int idx = 1;
        Stack<Integer> stack = new Stack();
        
        while(idx <= len) {
            int A = len1 - idx < 0 ? 0 : arr1[len1 - idx] - '0';
            int B = len2 - idx < 0 ? 0 : arr2[len2 - idx] - '0';
            int AB = A + B + ten;
            ten = AB / 10;
            if(idx < len) AB %= 10; 
            stack.push(AB);
            idx++;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        answer = sb.toString();
        
        return answer;
    }
}