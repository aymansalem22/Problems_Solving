
package level1;

import java.util.Scanner;


public class stars6 {

    
    public static void main(String[] args) {
      /**       n=5
 * 0*    #     j>=4 && j<=4
 * 1*   ###    j>=3 && j<=5
 * 2*  #####   j>=2 && j<=6
 * 3* #######  j>=1 && j<=7
 * 4*######### j>=0 && j<=8
 * 5* #######  j>=1 && j<=7
 * 6*  #####   j>=2 && j<=6
 * 7*   ###    j>=3 && j<=5
 * 8*    #     j>=4 && j<=4  
 */         //   i-3     9-i
 
 //n=5 i =9  n*2-1
 //n=6 i =12
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if(i<n){
                if(j>=n-1-i && j<=n-1+i){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
                }
                else{
                if(j >= i - (n - 1) && j <= 3 * (n - 1) - i){
                System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
                
                }
                
            }System.out.println("");
        }
 
 
    }
    
}
