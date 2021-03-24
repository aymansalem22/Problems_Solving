
package level1;

import java.util.Scanner;


public class stars2 {

   
    public static void main(String[] args) {
     //Assignment#1
        /**
         * n = 5
          #####
        *  ####
        *   ###
        *    ##
        *     #
         */
        Scanner sc=new Scanner(System.in);
         System.out.println("enter n :");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for (int j = n; j >i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        System.out.println("second soultion");
        System.out.println("enter n :");
         int n1 =sc.nextInt();
    
     for(int i=0;i<n1;i++){
     for(int j=0;j<n1;j++){
     if(j>=i){
         System.out.print("#");
     }else{System.out.print(" ");}
     }
         System.out.println();
     }
        
    }
    
}
