/*
 * Created by: Jose Ruiz-Ramon
 * REV 1.1
 * This program is the part 2.
 */

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.HTMLDocument.Iterator;

public class IntegrationPartTwo {
  
  
  
  public static void main (String [] args ){
    
    int count = 5;
    int iteration = 1;
    while(count != 0){
      
      System.out.printf("(WHILE) This is iteration #%2d , variable count is %2d \n" , iteration , count);
      iteration++;
      
      count--;
    }
    
    System.out.println("The loop finished when count == 0");
    iteration = 1;
    
    for (int i = 0; i < 5; i++){
      System.out.printf("(FOR) This is iteration #%2d , variable i is %2d \n" , iteration , i);
      
    }
    
    System.out.println("The FOR loop finished when i == 0");
    
    iteration = 1;
    count = 5;
    do{
      
      System.out.printf("(DO-WHILE) This is iteration #%2d , variable count is %2d \n" , iteration , count);
      count--;
      iteration++;
    }while (count !=0 );
    
    System.out.println("The DO-WHILE loop finished when count == 0");
    
    count = 12;
    
    int [] numbersBreak = {10, 20, 30, 40, 50};
    for(int x : numbersBreak ) { // foreach 
       if( x == 30 ) {
          break;
       }
       System.out.print( x );
       System.out.print("\n");
    
   
    }
    
    System.out.println("The foreach loop finished "
        + "at the third index [2]. If x = 30 then break.");
    int [] numbers = {10, 20, 30, 40, 50};
    for(int xx : numbers ) {
       if( xx == 30 ) {
          continue;
       }
       System.out.print( xx );
       System.out.print("\n");
    
    }
    System.out.println("The foreach loop finished completely "
        + "If x = 30 then continue.");

       
    String firstName = "Jose";
    String lastName= "Ruiz-Ramon";
    
    SeparateFileClass myNameJose = new SeparateFileClass(firstName, lastName); // instantiate
    System.out.println(myNameJose.getFirstName() + " from getter getFirstName().");
    System.out.println(myNameJose.getLastName() + " from getter getLastName().");
    myNameJose.printName();
    System.out.println(" from calling the void method printName() \n");
 
    
    firstName = "Papi";
    SeparateFileClass myNamePapi = new SeparateFileClass(firstName); // calling overloaded constructor
    myNamePapi.printName();
    System.out.println(" from calling the void method printName() \n");
    
    myNamePapi.setLastName("James");
    myNamePapi.printName();
    
    SeparateFileClass myNameNull = new SeparateFileClass();
    System.out.println(myNameNull.getFirstName()); // calling no args constructor
    
    int len = 12;
    int high = 13;
    Rectangle myRect = new Rectangle(len, high); // instantiated a subclass that will use methods from superclass (very important indeed)
    System.out.println(myRect.getArea() + " the subclass Rectangle used getArea() from the superclass Polygon.");
    
    
    int arr[] = {12, 34, 2, 21, 43};
    System.out.println("int arr[] = {12, 34, 2, 21, 43}");
    int smallest = getSmallest(arr); // smallest value
    System.out.println("smallest value of arr[] = " + smallest);
    int sumOfArray = getArraySum(arr); // sum of array
    System.out.println("sum of arr[] = " + sumOfArray);
    

    int[][] mrr = new int[6][5];
    
    System.out.println("int[][] mrr = new int[6][5] MEANS 6 ROW 5 COLUMNS" );
    for (int i = 0; i < mrr.length; i++) {
      for (int j = 0; j < mrr[i].length; j++) {
        mrr[i][j] = j;
        
        System.out.print(mrr[i][j] + " ");
        } // for nested
    System.out.println("");
      } // for
    List<String> stringList = new ArrayList<String>();
    
    stringList.add("Jose");
    stringList.add("wears");
    stringList.add("MAGNUM™");
    stringList.add("I am the last value.");
    
    java.util.Iterator<String> iterate = stringList.iterator();
    
    while(iterate.hasNext()){
      System.out.println(iterate.next());
    }
    
    searchTwoDimensionalArrays(mrr, 4);
    System.out.println("This line above me, searched all cells that contain 4");
   
    
  
   }// main 


 

  public static int getSmallest(int[] a){  
    int temp;  
    for (int i = 0; i < a.length-1; i++)   // selection sort then get smallest by first index
            {  
                for (int j = i + 1; j < a.length-1; j++)   
                {  
                    if (a[i] > a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
           return a[0];  
  }
  
  public static int getArraySum(int[]a){
    int total = 0;
    for (int i = 0; i < a.length; i++){
      total = total + a[i]; // accumulator
    }
    
    return total;
    
  }
  
  public static void searchTwoDimensionalArrays(int[][]a , int k){
    
    
    for (int i=0; i<a.length; i++) {
      for (int j=0; j<a[i].length; j++){
        if(a[i][j] == k)
          System.out.printf(a[i][j] + " (%d,%d) \n" , i, j);
      }
    }
  }


} // main class

class Polygon{
  
  private double x;
  private double y;
  private double z;
  
  
  public Polygon(double x, double y, double z){
    this.x = x;
    this.y = y;
    this.z = z;
    
  }

  
  public Polygon(double x, double y){
    this.x = x;
    this.y = y;
    
  }
  public Polygon(double x){
    this.x = x;
    
  }
  
  public double getX() {
    return x;
  }
  public void setX(double x) {
    this.x = x;
  }
  public double getY() {
    return y;
  }
  public void setY(double y) {
    this.y = y;
  }
  public double getZ() {
    return z;
  }
  public void setZ(double z) {
    this.z = z;
  }
  
  public double getArea(){
    return this.x * this.y;
  }
  
}

class Rectangle extends Polygon{ // polymorphism

  public Rectangle(double x, double y) {
    super(x,y); //polymorphism 
    
    
  }
  public Rectangle(double x) {
    super(x);
    
    
  }
  
  
  
  
}


class Solve{
  
  
  
}



