/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1;

import java.util.Scanner;

/**
 *
 * @author sayma
 */
public class DecodeString {

    /**
         * Assignment 4: Decode input: String s = "a6b3c4d3a1b2c3" or
         * "aa6b15ab12" output: "aaaaaabbbccccdddabbccc"
         */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("enter the decode word ");
       String s=scan.next();
       String decryptedStr="";
       String chars="";
       String numberStr="";
       boolean numberDigit=false;
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if(Character.isDigit(c)){
            numberStr+=c;
            numberDigit=true;
            }
            else{
            if(numberDigit){
            decryptedStr=repeatChars(numberStr, decryptedStr, chars);
            numberStr="";
            chars="";
            }
            numberDigit=false;
            chars+=c;
            }
        }
       decryptedStr=repeatChars(numberStr, decryptedStr, chars);
        System.out.println(decryptedStr);
       
    }
    
    public static String repeatChars(String numberStr,String decryptedStr
    ,String chars){
    int repeat=Integer.parseInt(numberStr);
        for (int i = 0; i < repeat; i++) {
            decryptedStr+=chars;
        }
        return decryptedStr;
    
    }
    
}
