class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch(n) {
            case 1 : 
                answer = new int[b + 1];
                break;
            case 2 : 
                answer = new int[num_list.length - a];
                break;
            case 3 : 
                answer = new int[b - a + 1];
                break;
            case 4 : 
                answer = new int[(b - a) / c + 1];
                break;
        }
        
        int idx = 0;
        int i = 0;
        while(i < num_list.length) {
            switch(n) {
                case 1 :
                    if(i <= b) {
                        answer[idx] = num_list[i];
                        idx++;
                    }
                    i++;
                    break;
                case 2 :
                    if(i >= a) {
                        answer[idx] = num_list[i];
                        idx++;
                    }
                    i++;
                    break;
                case 3 :
                    if(i >= a && i <= b) {
                        answer[idx] = num_list[i];
                        idx++;
                    }
                    i++;
                    break;
                case 4 :
                    if(i >= a && i <= b) {
                        answer[idx] = num_list[i];
                        idx++;
                        i += c - 1;
                    }
                    i++;
                    break;
            }
        }
        
        return answer;
    }
}