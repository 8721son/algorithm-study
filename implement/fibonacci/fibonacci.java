package implement.fibonacci;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    public static long fibonacci(long n){
        if(n<3){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
