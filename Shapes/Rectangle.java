public class Rectangle implements Shape {
  protected double sideA; //rectangles are defined by their two side lengths
  protected double sideB;

  public Rectangle(double sideA, double sideB){
    if (sideA <= 0 || sideB <= 0){ //can't have negative or 0 side length
      System.out.println("Invalid side length!");
    }
    else {
      this.sideA = sideA;
      this.sideB = sideB;
    }
  }

  public double getPerimeter(){ //for rectangles P = 2(A + B)
    return (2 * (this.sideA + this.sideB));
  }

  public double getArea(){ //for rectangles A = AB
    return (this.sideA * this.sideB);
  }
}
