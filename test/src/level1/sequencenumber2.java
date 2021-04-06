
package level1;

import java.util.Scanner;


public class sequencenumber2 {

   // 0 1 1 2 3 5 8 13 21 ...
      //x y z        x y z       x y z       x y z
     // 0 1 1 2      1 1 2       1 2 3       2 3 5
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please insert n");
        int n=sc.nextInt();
       
       int x=0;
       int y=1;
       int z=0;
        System.out.println(x);
        System.out.println(y);
        
        while(x+y<n){
        z=x+y;
        System.out.println(z);
        x=y;
        y=z;
        
        }
        
    }
    
}
