public class Rewrite {

  public static void main(String[] args){

  original();
  System.out.println("#########################");
  oneLoop();
  System.out.println("#########################");
  arbitraryN(14);
  }

  //the original method
  public static void original(){

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= (5 - i); j++) {
        System.out.print(".");
      }

      for (int k = 1; k <= i; k++) {
        System.out.print(i);
      }

      System.out.println();

    }
  }

  //I solved this by instead iterating through the total amount of prints we have to do
  public static void oneLoop(){
    //setting starting condition for first line of 4 dots and one number/the number 1
    int dots = 4;
    int number = 1;

    for (int i = 0; i < 25; i++){
      //if there are no more dots to print, start printing numbers
      if (dots == 0){
        //if we have hit the end of a line, go to next line and reset all the variables
        if((i + 1) % 5 == 0) {
          System.out.println(number);
          number++;
          dots = 5 - number;
        }
        //else just print a number
        else{
          System.out.print(number);
        }
      }
      else{
        System.out.print(".");
        dots--;
      }
    }
  }

  //by just figuring out the equivalent relationships between the numbers I needed above to make it work
  //I found that the number of dots went down from n-1(4 in the original case) to 0, and that the loop should go for n^2 iterations(25 originally)
  //the output is skewed in console but it appears to work correctly
  public static void arbitraryN(int n){
    int dots = n - 1;
    int number = 1;

    for (int i = 0; i < (n * n); i++){
      if (dots == 0){
        if((i + 1) % n == 0) {
          System.out.println(number);
          number++;
          dots = n - number;
        }
        else{
          System.out.print(number);
        }
      }
      else{
        System.out.print(".");
        dots--;
      }
    }
  }
}
