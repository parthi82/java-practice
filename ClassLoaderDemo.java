
 /**
  * This program is used to demonstrate Class Loader in java
  * The java.lang.ClassLoader searches for class and loads it
  * into the memory when ever a class is refered in a program 
  * and creates java.lang.class object which stores staic 
  * variables and methods. The class loader also invokes
  * static initializers and explicit initializer in order
  */

  public class ClassLoaderDemo {
      
      // explicit initializer
      private static int number1 = 11;

      // static initializer 
      static {
         number1 = 99;
         number2 = 88;
         System.out.println(" Loading Class...........................");
      }

      // explicit initializer
      private static int number2 = 22;

      public static void main(String[] args) {

          System.out.println(" Number1 is " + number1);
          System.out.println(" Number2 is " + number2);

      }

  }