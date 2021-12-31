package test;

import java.util.*;

public class functional{
    public static void main(String[] args) {
        int value = 1;
        Integer refer = 1;
       
        // System.out.println(plus(value));
        // System.out.println(value);
        // System.out.println(plus(refer));
        // System.out.println(refer+1);
        // System.out.println(refer);

        List<Integer> list = new ArrayList<>();
        showList(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int plus(int a){
        a = 2;
        return a;
    }

    public static List<Integer> showList(List<Integer> list){
        list.add(1);
        return list;
    }
}
