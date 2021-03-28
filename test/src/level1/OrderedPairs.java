
package level1;

import java.util.Scanner;


public class OrderedPairs {

   
    public static void main(String[] args) {
       // Input: n = 2
        // (0,5)
        // (1,4)
        // (2,7)
        // (3,6)
        
        //        System.out.println("("+ x + "," + y+ ")");
        
        // n = 3
        // (0,8)
        // (1,7)
        // (2,6)
        // (3,11)
        // (4,10)
        // (5,9)
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=0;x<2*n;x++){
        int y=x+(3*n-1)-2*(x%n);
            System.out.println("("+x+", "+y+")");
        }
        
        
        
        System.out.println("second solution");
        int n1=sc.nextInt();
        int y=3*n-1;
        for(int x=0;x<2*n;){
            System.out.println("("+x+", "+y+")");
            x++;
            if(x==n){
            y=4*n-1;
            }else{
            y--;
            }
        }
        
    }
    
}
