/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task6;

/**
 *
 * @author tashana
 */
public class Rectangle extends Quadrilateral {
    
    public Rectangle(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }
    public void coordinates(){
     System.out.println("Coordinates of Rectangle are:("+x1+","+y1+"), ("+x2+","+y2+"), ("+x3+","+y3+"), ("+x4+","+y4+") ");
}
double area()
{
double d1=(double)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
double d2=(double)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
System.out.println( d1*d2);
        return 0;

}

}
