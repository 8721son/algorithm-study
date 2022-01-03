import java.util.Arrays;
import java.util.Scanner;

public class BJ1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrN = new int[n];
        for(int i = 0; i<n; i++){
           arrN[i]=sc.nextInt();
        }
        Arrays.sort(arrN);
        int m = sc.nextInt();
        int[] arrM = new int[m];
        for(int i=0; i<m; i++){
            arrM[i]=sc.nextInt();
        }
        
        for(int i =0; i<m;i++){
            if(Arrays.binarySearch(arrN, arrM[i])>=0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }       
    }    

}
