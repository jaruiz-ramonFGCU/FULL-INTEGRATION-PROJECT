/*
 * Created by: Jose Antonio Ruiz-Ramon
 * 
 * 
 * This class is every single command that does not require the use of multiple classes
 * 
 * 
 * 
 */

/**
 * @author Jose Ruiz-Ramon
 * 
 */

import java.util.Random;
import java.math.*;

// TODO: Auto-generated Javadoc
/**
 * This is the first PSI for the Integration Project.
 *
 * @author Jose A. Ruiz-Ramon
 */
public class SingleClassStuff {

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    // greet
    System.out.println(
        "Hello User! This is a showcase of JAVA " + "\nwithout the use of multiple classes.");

    System.out.println(
        " byte = -128 to 127 inclusive short = -32768 to 32767 \n int = -2^31 to 2^31-1 \n long = -2^63 to 2^63-1 "
            + "\n float & double = #.##  \n boolean = true || false \n char = ASCII");
    
    /**
     * @param main() 
     * 
     */
    
    System.out.println("-");
    int age = 20; // equal operator means
    double height = 6.03;
    String myName = "Jose Antonio Ruiz-Ramon";
    final String BIRTH_DATE = "11/10/1997"; // final means constant (never changes)

    System.out.printf(
        "My name is %s, I was born in %s, " + "so I'm %d years old, and my" + " height is %f",
        myName, BIRTH_DATE, age, height); // formating with escape sequences

    System.out.println("-");

    double sum = (double) (age) + height; // casting you turn a lighter type to a heavier type

    System.out.println(sum);

    System.out
        .println("Variable: a location in memory. \nScope = Where you can access the variable");

    System.out.println("-");

    System.out.println("chatAt(2) " + myName.charAt(2)); // return a char = s
    System.out.println("substring(0, 4) " + myName.substring(0, 4)); // returns Jose
    System.out.println("length() " + myName.length()); // returns length of such string

    System.out.println("-");

    String helloGuy = helloGuyMethod(myName); // calling method with argument
    System.out.println(helloGuy);

    helloGuyVoid(); // void method call

    System.out.println("-");
    Random randy = new Random(); // random class

    for (int i = 1; i <= 5; i++) {

      int a = randy.nextInt(69);
      System.out.println("randy the random generator generated: " + a);
    } // for loop

    System.out.println("-");

    boolean joseIsMale = true; // using boolean
    if (joseIsMale == true) // if
      System.out.println("Ya boy Jose is indeed a male!");
    else // else
      System.out.println("Jose is a girly man");

    System.out.println("-");

    String result; // the ternary operator will asign a value
    System.out.println(result = (joseIsMale == false) ? "Ya boy Jose is indeed a male! (ternary)" // conditional
                                                                                                  // operator
                                                                                                  // '?'
        : "Jose is a girly man (ternary)"); // ternary condition

    System.out.println("-");

    char myChar = 'B'; // single quotes cause it's a char yo

    switch (myChar) { // case switch
      case 'A':
        System.out.println("It's A");
        break;
      case 'B':
        System.out.println("It's B");
        break;
      case 'C':
        System.out.println("It's C");
        break;
      default:
        System.out.println("haha");
    }
    System.out.println("-");

    int anyNum = -34;
    if (anyNum > 0 || anyNum < 0) { // conditional operator with OR and relational operators < , >
      System.out.println("Thank God anyNum is not 0.");
    }
    anyNum = 30;
    if (anyNum < 50 && anyNum > 25) // conditional operator with AND and relational operators < , >
      System.out.println("anyNum is within the range.");

    System.out.println("-");

    System.out.println("This following block of code will compare strings");
    String alpha = "Carlos";
    String beta = "carLos";
    String theta = ("Carlos");

    System.out.println(alpha.equals(beta));
    System.out.println(theta.equals(alpha)); // .equals() means String content
    // Strings are immutable
    System.out.println(alpha == beta);
    System.out.println(theta == alpha); // == means value in memory

    int zeroIsLexicographicallyEqual = alpha.compareTo(theta);

    System.out.println("alpha.compareTo( theta ) -> " + zeroIsLexicographicallyEqual);
    System.out.println("End of String comparison.");
    System.out.println("-");
    anyNum = 30;
    System.out.println("anyNum + 20 =" + (anyNum + 20)); // sum
    System.out.println("anyNum - 2 =" + (anyNum - 2)); // sub
    System.out.println("anyNum * 3 =" + (anyNum * 3)); // mult
    System.out.println("anyNum / 2 =" + (anyNum / 2)); // div
    System.out.println("anyNum % 2 =" + (anyNum % 2)); // mod
    System.out.println("anyNum++ =" + (anyNum++)); // increment by 1
    System.out.println("anyNum-- =" + (anyNum--)); // decrement by 1
    System.out.println("anyNum += 2 =" + (anyNum += 2)); // increment variable by n (n=2 in this
                                                         // case)
    System.out.println("Math.pow(2,4) = " + Math.pow(2, 4)); // Math POW

  } // main

  /**
   * method that calls just the output, no void.
   */
  private static void helloGuyVoid() { // method header
    System.out.println("Hello Guy! (from void!)");

  }

  /**
   * method that returns a String.
   *
   * @param name the name
   * @return name
   */
  private static String helloGuyMethod(String name) { // method head with parameters
    return "Hello Guy!, my name is " + name;

  }

}
