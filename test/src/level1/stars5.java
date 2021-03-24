
package level1;

import java.util.Scanner;


public class stars5 {

  
    public static void main(String[] args) {
              
/*
i      j     012345678910                        
0                 #                 j==5 ||j==5                      
1                # #                         
2               #   #                         
3              #     #                        
4             #       #                      
5            #         #                     
6           #           #
*/
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < n+n; j++) {
                  if( j==n-i ||j== n+i){
                      System.out.print("#");
                  }
                  else{
                      System.out.print(" ");
                  }
              }System.out.println("");
        }

    }
    
}
