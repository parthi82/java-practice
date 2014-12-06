
 /**
  * This program demonstrates Instance Initializer 
  * in java. It runs during instantiation process 
  * to intialize an instance.
  */

  public class InstanceInitializer {

     // instance variable
     int number;

     // instance initializer
     {

        number = 88;
        System.out.println(" Creating an instance................");

     }

     public static void main(String[] args) {

        InstanceInitializer ins1 = new InstanceInitializer();  // runs instance intializer before body of a constructor
        
        System.out.println(" number = " + ins1.number);

     }

  }