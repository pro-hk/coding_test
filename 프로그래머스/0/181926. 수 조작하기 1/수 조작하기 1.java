class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        char[] c = control.toCharArray();
        
        for(int i = 0; i < c.length; i++) {
            switch(c[i]) {
                case 'w' : 
                    answer += 1;
                    break;
                case 's' :
                    answer -= 1;
                    break;
                case 'd' :
                    answer += 10;
                    break;
                case 'a' :
                    answer -= 10;
                    break;
            }
        }
        
        return answer;
    }
}