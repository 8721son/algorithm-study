package structure.deque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ5430 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String p = sc.next();
			int n = sc.nextInt();
            st = new StringTokenizer(sc.next(), "[],");
            Deque<Integer> deque = new LinkedList<>();
            int trigger = 1;
            for(int j = 0; j < n; j++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}
            
            for (char c : p.toCharArray()) {
                if(c=='R'){
                    trigger *= -1;
                }else if(c=='D'){
                    if(deque.size()==0){
                        sb.append("error\n");
                        trigger=0;
                        continue;
                    }
                    if(trigger==1){
                        deque.removeFirst();
                    }else{
                        deque.removeLast();
                    }
                }
            }

            int size = deque.size();
            if(trigger==-1){
                sb.append("[");
                
                for (int k=0; k<size; k++) {
                    if(deque.size()==1){
                        sb.append(deque.poll());
                    }else{
                        sb.append(deque.pollLast());
                        sb.append(",");
                    }
                }
                sb.append("]\n");
            }else if(trigger==1){
                sb.append("[");
                for (int k=0; k<size; k++) {
                    if(deque.size()==1){
                        sb.append(deque.poll());    
                    }else{
                        sb.append(deque.pollFirst());
                        sb.append(",");
                    }
                }
                sb.append("]\n");
            }
        }

    
        System.out.println(sb);
        
    }

}
