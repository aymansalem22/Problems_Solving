
package level1;

import java.util.Scanner;


public class Triangles {
         // Assignment
        // Inputs: x= 4, y=3, z=5 Triangle
        // Right, Acute, Obtus
        // z^2 = x^2 + y^2  --> Right
        // z^2 > x^2 + y^2  --> Obtus
        // z^2 < x^2 + y^2  --> Acute
   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter x ");
       int x=sc.nextInt();
       x=x*x;
       System.out.println("enter y ");
       int y=sc.nextInt();
       y=y*y;
       System.out.println("enter z biggest number/n");
       int z=sc.nextInt();
       z=z*z;
       
       
       if((x+y)==z){
           System.out.println("the traingle is right");
       }
       else if(z>(x+y)){
           System.out.println("the triangle is obtus");
       }
       else{
           System.out.println("the triangle is Actue");
       }
       //********************
       
       System.out.println("second program without know who is biggest");
       System.out.println("enter x ");
       x=sc.nextInt();
       x=x*x;
       System.out.println("enter y ");
       y=sc.nextInt();
       y=y*y;
       System.out.println("enter z ");
       z=sc.nextInt();
       z=z*z;
       int max=z;
       int p1=x,p2=y;
       if(z<x&&y<x){
       max=x;
       p1=y;
       p2=z;
       }else if(z<y&&x<y){
       max=y;
       p1=x;
       p2=z;
       
       }
       if(max==(p1+p1)){
           System.out.println(" the triangle is Right");
       }
       else if(max>(p1+p2)){
           System.out.println(" the triangle is obtus");
       }
       else{
           System.out.println(" the triangle is Actue");
       }
       
       
       }
       
       
    }
    
