
package level1;


public class arraysum {

    
    public static void main(String[] args) {
      int [][]matrix1={
          {6,4,2},
          {9,4,-2},
          {6,1,5}
      }; 
      int [][]matrix2={
          {4,8,1},
          {3,0,9},
          {7,4,2}
      };
      
      int [][]result=new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        
        for (int[] s : result) {
            for (int i : s) {
                System.out.printf("%5d",i);
            }
            System.out.println("");
        }
    
    
    
    
    }
    
}
