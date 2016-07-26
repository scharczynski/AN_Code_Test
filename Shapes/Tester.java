class Tester {
  public static void main (String[] args) {

    //testing the triangle class, including bad parameters
    System.out.println("Testing triangle class");
    Triangle triangle =  new Triangle(2.0, 3.0, 4.0);
    Triangle badTriangle =  new Triangle(-2.0, 3.0, 4.0);
    System.out.println(triangle.getPerimeter());
    System.out.println(triangle.getArea());

    //testing circle class, including bad parameters
    System.out.println();
    System.out.println("Testing circle class");
    Circle circle = new Circle(5.0);
    Circle badCircle = new Circle(-2.0);
    System.out.println(circle.getPerimeter());
    System.out.println(circle.getArea());

    //testing rectangle class, including bad parameters
    System.out.println();
    System.out.println("Testing rectangle class");
    Rectangle rectangle = new Rectangle(6.0, 10.0);
    Rectangle badRectangle = new Rectangle(0, -10.0);
    System.out.println(rectangle.getPerimeter());
    System.out.println(rectangle.getArea());

    //same for square
    System.out.println();
    System.out.println("Testing square class");
    Square square = new Square(5);
    Square badSquare = new Square(-123);
    System.out.println(square.getPerimeter());
    System.out.println(square.getArea());

    //and finally ellipse
    System.out.println();
    System.out.println("Testing ellipse class");
    Ellipse ellipse = new Ellipse(8,5);
    Ellipse badEllipse = new Ellipse(8,-5);
    System.out.println(ellipse.getPerimeter());
    System.out.println(ellipse.getArea());
  }
}
