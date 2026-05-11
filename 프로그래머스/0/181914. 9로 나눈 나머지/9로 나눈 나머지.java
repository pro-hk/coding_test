class Solution {
    public int solution(String number) {
        int answer = 0;
        
        char[] c = number.toCharArray();
        int sum = 0;
        
        for(int i = 0; i < c.length; i++) {
            sum += Character.getNumericValue(c[i]);
        }
        
        answer = sum % 9;
        
        return answer;
    }
}