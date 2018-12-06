
// TODO: Auto-generated Javadoc
/**
 * The Class SeparateFileClass.
 *
 * @author Jose Ruiz-Ramon
 */
public class SeparateFileClass {

  /** The first name. */
  private String firstName = null;
  
  /** The last name. */
  private String lastName = null;


  /**
   * Gets the first name.
   *
   * @return the first name
   */
  public String getFirstName() {
    return firstName;
  }


  /**
   * Sets the first name.
   *
   * @param firstName the new first name
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * Gets the last name.
   *
   * @return the last name
   */
  public String getLastName() {
    return lastName;
  }


  /**
   * Sets the last name.
   *
   * @param lastName the new last name
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * Instantiates a new separate file class.
   *
   * @param argA the arg A
   * @param argB the arg B
   */
  public SeparateFileClass(String argA, String argB) {

    this.firstName = argA;
    this.lastName = argB;


  } // constructor

  /**
   * Instantiates a new separate file class.
   *
   * @param argA the value to set the field firstName
   */
  public SeparateFileClass(String argA) {

    this.firstName = argA;


  } // overloaded constructor

  /**
   * Instantiates a new object.
   */
  public SeparateFileClass() {
    this.firstName = null;
    this.lastName = null;
  } // no args constructor

  /**
   * Prints the name.
   */
  public void printName() {

    System.out.print(this.firstName + " ");

    if (this.lastName != null)
      System.out.print(lastName);

  }


}
