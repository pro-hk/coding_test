class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        int s1 = my_string.length();
        int s2 = is_suffix.length();
        
        if(my_string.charAt(s1 - 1) == is_suffix.charAt(s2 - 1) && s1 >= s2) {
            if(my_string.substring(s1 - s2, s1).equals(is_suffix)) answer = 1;
        }
        
        return answer;
    }
}