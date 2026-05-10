class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        char[] c = my_string.toCharArray();
        
        for(int i = 0; i < index_list.length; i++) {
            int idx = index_list[i];
            sb.append(c[idx]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}