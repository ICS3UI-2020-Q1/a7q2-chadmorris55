/**
 *
 * @author 
 */
public class Main {


  //creates method
  public static void factors(int number){
    //checks if the result is 0 and if so, prints out whatever "i" is
    for (int i = 1; i <= number; i++){
      if (number % i == 0){
        System.out.println(i);
      }
    }
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    //call factors method
    factors(30);
  }
}
