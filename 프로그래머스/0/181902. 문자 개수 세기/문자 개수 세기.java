class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        char[] c = my_string.toCharArray();
        for(int i = 0; i < c.length; i++) {
            int idx = 0;
            if(Character.isUpperCase(c[i])) idx = (int) c[i] - 65;
            else idx = (int) c[i] - 97 + 26;
            answer[idx]++;
        }
        
        return answer;
    }
}