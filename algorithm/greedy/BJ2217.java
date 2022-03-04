package algorithm.greedy;

import java.util.*;

public class BJ2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i =0 ;i<n ;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int max = 0;
		for(int i = 0; i < n; i++) {
            max = Math.max(max, list.get(i) * (n - i));
        }
        
        System.out.println(max);
    }

}
