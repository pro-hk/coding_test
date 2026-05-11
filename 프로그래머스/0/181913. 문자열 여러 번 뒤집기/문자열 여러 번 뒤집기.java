class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        char[] c = my_string.toCharArray();
        
        for(int i = 0; i < queries.length; i++) {
            int cnt = 0;
            int s = queries[i][0];
            int e = queries[i][1];
            for(int j = s; j + cnt < e; j++) {
                char tmp = c[j];
                c[j] = c[e - cnt];
                c[e - cnt] = tmp;
                cnt++;
            }
        }
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < c.length; i++) {
            sb.append(c[i]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}