import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        Arrays.sort(indices);
        
        StringBuffer sb = new StringBuffer();
        char[] c = my_string.toCharArray();
        int idx = 0;
        for(int i = 0; i < c.length; i++) {
            if(idx < indices.length && i == indices[idx]) {
                idx++;
                continue;
            }
            
            sb.append(c[i]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}