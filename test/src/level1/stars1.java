
package level1;

import java.util.Scanner;


public class stars1 {

  
    public static void main(String[] args) {
       //        assigmenet 
//          #
//         ##
//        ###
//       ####
//      #####

Scanner sc=new Scanner(System.in);
        System.out.println("enter n: ");
int n=sc.nextInt();
for(int i=n-1;i>=0;i--){
    for (int j = 0; j < n; j++) {
        if(j>=i){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }System.out.println("");


}
    }
    
}
