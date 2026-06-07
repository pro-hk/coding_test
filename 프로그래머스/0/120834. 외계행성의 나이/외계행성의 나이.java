class Solution {
    public String solution(int age) {
        String answer = "";
        
        int cnt = (int) Math.log10(age);
        StringBuilder sb = new StringBuilder();
        while(cnt > 0) {
            sb.append((char) (age / Math.pow(10, cnt) + 'a'));
            age %= Math.pow(10, cnt);
            cnt--;
        }
        sb.append((char) (age + 'a'));
        
        answer = sb.toString();
        
        return answer;
    }
}