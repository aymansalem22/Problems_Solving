
package level1;

import java.util.Scanner;


public class EncodeString {

  /**
     * Assignment 3: Encode
     * input: String s = "aaaaaabbbccccdddabbccc"
     * output: "a6b3c4d3a1b2c3"
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String encryptedStr="";
       char a=s.charAt(0);
       int counter=1;
        for (int i = 1; i < s.length(); i++) {
            if(a==s.charAt(i)){
            counter++;
            }
            else{
              
              
            encryptedStr+=a+""+counter;
            counter=1;
            a=s.charAt(i);
            }
        }
        encryptedStr+=a+""+counter;
        System.out.println(encryptedStr);
        
    }
    
}
