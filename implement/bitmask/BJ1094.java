package implement.bitmask;
import java.util.Scanner;

public class BJ1094 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();

        String binary = Integer.toBinaryString(x);
        int res = 0;
        for (char c : binary.toCharArray()) {
            if(c=='1'){
                res+=1;
            }
        }
        System.out.println(res);
    }
}
