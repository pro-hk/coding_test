import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int idx = 1;
        
        while(idx <= n) {
            for(int i = 0; i < idx; i++) {
                System.out.print("*");
            }
            if(idx < n) System.out.println();
            idx++;
        }
    }
}