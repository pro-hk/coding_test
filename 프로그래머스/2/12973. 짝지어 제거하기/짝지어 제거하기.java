class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        /* 효율성 0
        StringBuffer sb = new StringBuffer(s);
        int idx = 0;

        while(idx < sb.length() - 1) {
            char c1 = sb.charAt(idx);
            char c2 = sb.charAt(idx + 1);

            if(c1 == c2) {
                // sb.delete(idx, idx + 2); 효율성 0
                sb.deleteCharAt(idx + 1);
                sb.deleteCharAt(idx);
                idx = 0;
            } else {
                idx++;
            }
        }

        answer = sb.length() == 0 ? 1 : 0;
        */
        
        // 스택으로 했다는 힌트 얻음
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < c.length; i++) {
            int len = sb.length();
            if(len == 0) {
                sb.append(c[i]);
                continue;
            }
            
            if(c[i] == sb.charAt(len - 1)) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c[i]);
            }
        }
        
        if(sb.length() == 0) answer = 1;
        
        return answer;
    }
}