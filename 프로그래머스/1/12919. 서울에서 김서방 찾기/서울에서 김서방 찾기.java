class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        
        int x = 0;
        for(String s : seoul) {
            if(s.equals("Kim")) break;
            x++;
        }
        
        sb.append("김서방은 " + x +"에 있다");
        answer = sb.toString();
        
        return answer;
    }
}