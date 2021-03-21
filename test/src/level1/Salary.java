
package level1;

import java.util.Scanner;


public class Salary {


    public static void main(String[] args) {
      // Assignment#1
        // Inputs 
        //  salary = 4000, annualRate = 0.2, savingTarget = 1,000,000; 
        // How many years and months to achieve saving target
        
        Scanner sc=new Scanner(System.in);
        double salary=sc.nextDouble();
        double anualRate=sc.nextDouble();
        int target=sc.nextInt();
        sc.close();
        System.out.println("Finish");
        int i;
        double gainedSalary=0;
        for(i=1;gainedSalary<=target;i++){
        gainedSalary+=salary;
        if(i%12==0){
        salary+=salary*anualRate;
        }
        }
        System.out.println(salary);
        System.out.println(i-1);
        System.out.println((i-1)/12+" years, and "+(i-1)%12+" months");
    }
    
}
