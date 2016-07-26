//an ellipse can be defined by its two axes, the major axis and the minor axis
public class Ellipse implements Shape {
  protected double major;
  protected double minor;

  public Ellipse(double major, double minor){
    if (major <= 0 || minor <= 0){ //neither lenght should be <= 0
      System.out.println("Invalid input!");
    }
    else{
      this.major = major;
      this.minor = minor;
    }
  }

  //A = π * major axis length * minor axis length
  public double getArea(){
    return (Math.PI * this.major * this.minor);
  }

  //generous approximation, the perimeter of an ellipse is hard to calculate
  //fairly accurate until the ellipse becomes much longer than it is wide or vice versa
  public double getPerimeter(){
    return (2.0 * Math.PI * Math.sqrt((Math.pow(this.major, 2) + Math.pow(this.minor, 2)) / 2.0));
  }

}
