
package level1;

import java.util.Scanner;


public class plaindrome {

    public static void main(String[] args) {
      String str,rev="";
       Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        str=sc.nextLine();
        int length=str.length();
        for(int i=length-1;i>=0;i--){
        rev=rev+str.charAt(i);
            
           
        }
        if(str.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("isnt plaindrome");
        }
        
      
        
    }
    
}
