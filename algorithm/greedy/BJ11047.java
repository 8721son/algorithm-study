package algorithm.greedy;

import java.util.*;

public class BJ11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] arr = new Integer[n];
        int cnt =0;
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr,Collections.reverseOrder());
        while(k>0){
            for(int i=0 ;i<arr.length;i++){
                if(arr[i]<=k){
                    k-=arr[i];
                    cnt+=1;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
