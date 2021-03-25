
package level1;

public class arraymult {

   
    public static void main(String[] args) {
     int[][] matrix1={
        {0,1,2},
        {9,4,-2}
    };

//3*2
     
     int[][]matrix2={
         {2,8},
         {0,0},
         {5,4}
     };
     
     int[][]result=new int[matrix1.length][matrix2[0].length];
     //result=matrix[0][0]*matrix1[0][0]
     //
        for (int i = 0; i < result.length; i++) {
             for (int j = 0; j < result[i].length; j++) {
                 for (int k = 0; k < matrix2.length; k++) {
                   result[i][j] += matrix1[i][k] * matrix2[k][j];  
                 }
            }
            
        }

        for (int[] is : result) {
            for (int e : is) {
                System.out.printf("%5d",e);
            }
            System.out.println();
        }
     
     
     
    }
    
}
