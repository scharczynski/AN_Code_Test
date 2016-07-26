 //the implementation of triangle that makes the most sense is defining the triangle by its 3 sides
public class Triangle implements Shape {
  private double sideA;
  private double sideB;
  private double sideC;

  public Triangle (double sideA, double sideB, double sideC) {
    if (sideA <= 0 || sideB <= 0 || sideC <= 0){ //no side should be invalid
      System.out.println("Invalid side length!");
    }
    else {
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
    }
  }

  //P = A + B + C
  public double getPerimeter(){
    return (this.sideA + this.sideB + this.sideC);
  }
  // Area is given by Heron's formula for triangles where all side lengths are known
  // A = sqrt(s((s - A) * (s - B) * (s - C))), where s = (A + B + C) / 2
  public double getArea(){
    double s = (getPerimeter() / 2.0); // the "semiperimeter" of the triangle
    return (Math.sqrt(s * (s-this.sideA) * (s-this.sideB) * (s-this.sideC)));
  }
}
