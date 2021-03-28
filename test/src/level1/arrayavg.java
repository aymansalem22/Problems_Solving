
package level1;


public class arrayavg {
    
    //a     [5, 6,   3,    4,   .. , 100]
    //acc   [5, 11,  14,   18,  .. , 5050]
    //avg   [5, 5.5, 4.66, 4.5, .. , 50.5]
   
    public static void main(String[] args) {
       double[]a=new double[100];
        for (int i = 0; i < a.length; i++) {
            a[i]=i*2+1;
        }
        
        //acc[0]=a[0];
        //acc[1]=acc[o]+a[1];
        //acc[2]=acc[1]+a[2];
        //acc[i]=acc[i-1]+a[i]
        
        double[]acc=new double[a.length];
        acc[0]=a[0];
        for (int i = 1; i < acc.length; i++) {
            acc[i]=acc[i-1]+a[i];
        }
        
         System.out.print("[");
        for (double r : a) {
            System.out.print(r+", ");
        }
           System.out.println("]");
           
           System.out.println("********************** Sum ********************");
                System.out.print("[");
           for (double e : acc) {
            System.out.print(e+", ");
        }
            System.out.println("]");
            
        
        double []avg=new double[a.length];
        for (int i = 0; i <avg.length; i++) {
            avg[i]=acc[i]/(i+1);
        }
        System.out.println("********average");
        for (double d : avg) {
            System.out.print(d+", ");
        }
        
        
        
        
    }
    
}
