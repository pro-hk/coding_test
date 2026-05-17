class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        int lIdx = -1;
        int rIdx = -1;
        
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l") && lIdx < 0) {
                lIdx = i;
                answer = new String[lIdx];
                break;
            }
            if(str_list[i].equals("r") && rIdx < 0) {
                rIdx = i + 1;
                answer = new String[str_list.length - rIdx];
                break;
            }
        }
        
        for(int i = 0; i < str_list.length; i++) {
            if(lIdx > -1 && i < lIdx) {
                answer[i] = str_list[i];
            }
            if(rIdx > -1 && i >= rIdx) {
                answer[i - rIdx] = str_list[i];
            }
        }
        
        return answer;
    }
}