/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task6;

/**
 *
 * @author tashana
 */
public class Point {
  public static void main(String[] args) {
    Quadrilateral quadrilateral=new Quadrilateral(1.1,6.6,6.2,2.2,1.2,2.8,9.9,7.4);
    quadrilateral.coordinates();
    Trapezoid trapezoid=new Trapezoid(0,10,8,3.3,0,0,5,5);
    trapezoid.coordinates();
    trapezoid.height();
      trapezoid.area();
    Parallelogram parallelogram=new Parallelogram(5,11,12,6,5,5,20,20);
    parallelogram.coordinates();
    parallelogram.width();
    parallelogram.height();
    parallelogram.area();
    Rectangle rectangle=new Rectangle(17,30,30,17,14,14,28,28);
    rectangle.coordinates();
      rectangle.width();
    rectangle.height();
   rectangle.area();
    Square square=new Square(4,8,8,4,0,0,4,4);
   
    square.coordinates();
     square.height();
    square.area();
}
    
}
