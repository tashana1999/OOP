
package Task6;


public class Quadrilateral {
   
 double x1;
 double x2;
 double x3;
 double x4;
 double y1;
 double y2;
 double y3;
 double y4;
public Quadrilateral(double x1,double x2,double x3,double x4,double y1,double y2,double y3,double y4){
  this.x1=x1;
this.x1=x1;
this.x2=x2;
this.x3=x3;
this.x4=x4;
this.y1=y1;
this.y2=y2;
this.y3=y3;
this.y4=y4;
}

   
    public double getX1() {
        return x1;
    }

    
    public void setX1(int x1) {
        this.x1 = x1;
    }

    
    public double getX2() {
        return x2;
    }

    
    public void setX2(int x2) {
        this.x2 = x2;
    }

   
    public double getX3() {
        return x3;
    }

    
    public void setX3(int x3) {
        this.x3 = x3;
    }

    
    public double getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    
    public double getY1() {
        return y1;
    }

   
    public void setY1(int y1) {
        this.y1 = y1;
    }

    
    public double getY2() {
        return y2;
    }

    
    public void setY2(int y2) {
        this.y2 = y2;
    }

    
    public double getY3() {
        return y3;
    }

    
    public void setY3(int y3) {
        this.y3 = y3;
    }

    
    public double getY4() {
        return y4;
    }

    
    public void setY4(int y4) {
        this.y4 = y4;
    }
    public void coordinates(){
     System.out.println("Coordinates of Quadrilateral are:("+x1+","+y1+"), ("+x2+","+y2+"), ("+x3+","+y3+"), ("+x4+","+y4+") ");
}
 public void height(){
   System.out.println("Height is:"+(y4-y1));
}


public void width(){
   System.out.println("Height is:"+(x2-x1));
}

}
