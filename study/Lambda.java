package study;

import java.util.stream.IntStream;

public class Lambda {
    public static void main(String[] args) {
        Calc min = (x,y) -> x < y ? x : y;

        // 인터페이스에는 하나만 정의할 수 있는데 구현은 하기 나름

        // return 할땐 중괄호
        // type 쓰든 안쓰든
        Calc add = (int x,int y) -> {
            return x+y;
        };

        
        Calc max = (x,y) -> x > y ? x : y;

        // System.out.println(min.min(10, 20));
        // System.out.println(add.min(10, 20));    
        // System.out.println(max.min(10, 20));


        IntStream.range(0, 100)
        .skip(10)
        .filter(i -> i%9==0)
        .forEach(i -> System.out.println(i));
    }    

}

@FunctionalInterface
interface Calc{
        public int min(int x,int y);
}
