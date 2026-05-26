class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        int len = ex.length();
        StringBuilder sb = new StringBuilder();
        
        for(String s : str_list) {
            if(s.contains(ex)) continue;
            sb.append(s);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}