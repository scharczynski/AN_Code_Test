//a circle is an ellipse where the major and minor axes are equal
//inhereting from ellipse then makes sense
public class Circle extends Ellipse implements Shape {

  //calls parent constructor with both axes set to the circle's radius
  public Circle (double r){
    super(r, r);
  }

  //no reason to use the approximated circumference formula here C = 2πr
  @Override
  public double getPerimeter(){
    return (2 * this.major * Math.PI);
  }

}
