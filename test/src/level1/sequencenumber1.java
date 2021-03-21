
package level1;

public class sequencenumber1 {

    public static void main(String[] args) {
     //Assignment
        // input  n = 100
        // 1    2   4   6   9   12  16  20  25  30  36  42  49  56  64  72  81  90  100  
        // input n = 50
        //  1   2   4   6   9   12  16  20  25  30  36  42  49
        int n=100;
        int x=1;
        
        int z=1;
       
        
        for (int i = 1; z <=n; i++) {
            if((i%2==0)){
           x++;
               
            }
                System.out.println(z);
           z+=x;
        }
        
    }
    
}
