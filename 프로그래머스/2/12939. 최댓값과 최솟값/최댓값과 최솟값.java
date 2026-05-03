class Solution {
    public String solution(String s) {
        String answer = "";
        
        int max = 0;
        int min = 0;
        String[] ints = s.split(" ");
        
        for(int i = 0; i < ints.length; i++) {
            int num = Integer.parseInt(ints[i]);
            if(i == 0) {
                min = num;
                max = num;
                continue;
            }
            if(num > max) max = num;
            if(num < min) min = num;
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}