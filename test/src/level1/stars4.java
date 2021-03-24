
package level1;

import java.util.Scanner;


public class stars4 {

   
    public static void main(String[] args) {
        // i add n for this program to work automatically  donne
  
//  *                     j>=4-i     j<=4+i
//  0            #       j>=4    &&    j<=4
//   1     *    ###      j>=3&&j<=5
//   2     *   #####     j>=2&&j<=6
//   3    *   #######    j>=1&&j<=7
//   4     * #########   j>=0&&j<=8
//   n=5     */
//   n=6    ###########
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n*(n-1); j++) {
                if(j>=(n-1)-i&&j<=(n-1)+i){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }System.out.println("");
        }

    }
    
}
