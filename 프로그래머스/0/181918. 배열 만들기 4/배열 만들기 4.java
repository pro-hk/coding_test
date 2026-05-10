import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int c = 0;
        while(i < arr.length) {
            int n1 = arr[i];
            if(c == 0 || list.get(c - 1) < n1) {
                list.add(n1);
                i++;
                c++;
            } else {
                list.remove(c - 1);
                c--;
            }
        }
        
        stk = new int[list.size()];
        
        for(int j = 0; j < list.size(); j++) {
            stk[j] = list.get(j);
        }
        
        return stk;
    }
}