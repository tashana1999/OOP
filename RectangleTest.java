
package com.mycompany.lab4;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
    Rectangle r=new Rectangle(1,1);


     System.out.println("1.Set Length\n"+"2.Set Width\n"+"3.Exit");
     Scanner myObj = new Scanner(System.in);  

    System.out.println("Enter choice");
      int choice = myObj.nextInt();
    System.out.println("choice: " + choice); 
   if(choice==1){
     System.out.println("Enter Length");
     float length = myObj.nextFloat();
     r.setLength(length);
     r.perimeter();
     r.area();
     
}
     if(choice==2){
     System.out.println("Enter width");
     float width = myObj.nextFloat();
     r.setWidth(width);
     r.perimeter();
     r.area();
     
}  System.out.println("Enter choice");
       choice = myObj.nextInt();
    System.out.println("choice: " + choice); 
   if(choice==1){
     System.out.println("Enter Length");
     float length = myObj.nextFloat();
     r.setLength(length);
     r.perimeter();
     r.area();
     
}
     if(choice==2){
     System.out.println("Enter width");
     float width = myObj.nextFloat();
     r.setWidth(width);
     r.perimeter();
     r.area();
     
}  
}
    
}