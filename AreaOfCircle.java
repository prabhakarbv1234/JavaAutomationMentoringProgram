//3. Write a method that determines the area of a circle with radius X.
 
import static java.lang.Math.PI;
 
public class AreaOfCircle {
       public static void main(String[] args) {
              AreaOfCircle r = new AreaOfCircle();
              r.areaOfCircle(10); 
       }
       public void areaOfCircle(double r){
              double area;
              area = PI*(r*r); 
              System.out.println("Area of the circle: "+area);
       }      
}
