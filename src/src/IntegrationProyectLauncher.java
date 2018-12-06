/*
 * Created by: Jose Ruiz-Ramon REV 1.2.0 This program is a launcher that will launch the required
 * instructions of the whole integration project.
 */


import java.util.Scanner;
import legacy.SingleClassStuff;

// TODO: Auto-generated Javadoc
/**
 * This is the launcher of the whole project.
 * @author Jose Ruiz-Ramon
 */
public class IntegrationProyectLauncher {

  /** kb is the input object. */
  public static Scanner kb = new Scanner(System.in);

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {

    int key;
    System.out.println("HI VANCCELLO!, WELCOME TO OUR INTEGRATION PROJECT.");
    System.out.println("Enter 1 (or invalid value) for PTONE \nEnter 2 for PTTWO");

    try {
      while (true) {
        key = kb.nextInt();
        if (key == 1) {
          SingleClassStuff.main(args);
        } else if (key == 2) {
          IntegrationPartTwo.main(args);
        } else {
          System.out.println("There are only two options, buddy TRY AGAIN");
        }
      } // try


    } catch (Exception e) {
      System.err.println("ERROR ERROR ENTRY MUST BE INT RUN PROGRAM AGAIN");
      SingleClassStuff.main(args);

    } // catch



  }// main


}


