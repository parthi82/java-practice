
  /**
   * This program illustrates static import 
   */

   import static java.lang.System.out;  // import static variable out from the System class
   import static java.lang.Math.*;     // import all Static variables & methods from Math Class
   public class StaticImportDemo {

      public static void main(String[] args) {
          
          int die1 = (int)(6 * random()) + 1;
          int die2 = (int)(6 * random()) + 1;

          out.println(" Die 1 : " + die1);
          out.println(" Die 2 : " + die2);

      }
   
   }