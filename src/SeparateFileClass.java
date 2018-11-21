
public class SeparateFileClass{

  private String firstName = null;
  private String lastName = null;


  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public SeparateFileClass(String argA, String argB ){

    this.firstName = argA;
    this.lastName = argB;


  } // constructor

  public SeparateFileClass(String argA){

    this.firstName = argA;


  } // overloaded constructor

  public SeparateFileClass(){
    this.firstName = null;
    this.lastName = null;
  } // no args constructor

  public void printName(){

    System.out.print(this.firstName + " ");

    if (this.lastName != null)
      System.out.print(lastName);

  }


}
