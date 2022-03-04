package programmers;

import java.util.Scanner;

public class lv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    
    }

    public static int solution(int n) {
        int cnt = 0;

        while(n>1){
            if(n%2==1){
                cnt+=1;
            }
            n /= 2;
        }
        return cnt+1;
        // String binary = Integer.toBinaryString(n);
        // System.out.println(binary);
        // return Long.valueOf(binary.chars().filter(c -> c == '1').count()).intValue();
    }

}