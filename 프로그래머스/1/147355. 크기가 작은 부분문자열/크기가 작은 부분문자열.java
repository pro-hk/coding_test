class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int len = p.length();
        long P = Long.parseLong(p);
        
        for(int i = 0; i < t.length() - len + 1; i++) {
            long T = Long.parseLong(t.substring(i, len + i));
            if(T <= P) answer++;
        }
        
        return answer;
    }
}