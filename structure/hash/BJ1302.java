package structure.hash;

import java.util.*;

public class BJ1302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String book = sc.next();
            if(map.get(book)!=null){
                map.put(book, map.get(book)+1);
            }else{
                map.put(book, 1);
            }
        }

        int max =0;
        String maxBook="";

        for(String key : map.keySet()) {
            int value = map.get(key);
 
            if(max == value && maxBook.compareTo(key) > 0) {
                maxBook = key;
                max = value;
            } else if(max < value) {
                maxBook = key;
                max = value;
            }      
        }
 
        System.out.println(maxBook);
    }    
}
