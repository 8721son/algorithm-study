package structure.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        result(n, k);
    }
    
    public static void result(int n, int k){
        Queue<Integer> temp = new LinkedList<>();
        
        for(int i=1; i<=n;i++){
            temp.add(i);
        }
        System.out.print("<");
        while(temp.size()>0){
            for(int i=1;i<=k;i++){
                if(i==k){
                    if(temp.size()==1){
                        System.out.print(temp.poll());
                    }else{
                        System.out.print(temp.poll()+", ");
                    }
                    // result.add(temp.poll());
                }else{
                    int x = temp.poll();
                    temp.add(x);
                }
            }
        }
        System.out.println(">");
    }
}
