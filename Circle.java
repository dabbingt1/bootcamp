
import java.math.BigDecimal;

public class Circle {
    private double radius;

    // constructor
    // ! empty constructor
    public Circle () {
        }

    // ! all arguments constructor
    public Circle (double radius){
        this.radius = radius;
    }

    // get, set
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    // area
    // presentation
    public double area() {
        return BigDecimal.valueOf(this.radius)//
          .multiply(BigDecimal.valueOf(this.radius))//
          .multiply(BigDecimal.valueOf(Math.PI)) //
          .doubleValue(); //
    }

    public static void main(String[] args) {
       System.out.println(new Circle(3.5).area());
      

    }
}
