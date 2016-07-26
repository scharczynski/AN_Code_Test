// a square is a rectangle where both side lengths are equal, so inheriting its behavior from rectangle makes sense
public class Square extends Rectangle implements Shape {

  //constuctor is the same as its parent, but passing in the same value for both sides
  public Square(double length){
    super(length, length);
  }

}
