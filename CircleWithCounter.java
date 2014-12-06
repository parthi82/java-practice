
  /**
   * This program is used to demonstrate the use of
   * static variable in java. The static variable 
   * count is used to count the number of instances 
   * created.
   */

   public class CircleWithCounter {

      static int count = 0;  // static variable used to count the number of instances created

      private double radius; // Instance variable 
      
      // constructor
      public CircleWithCounter(double radius) {
         ++count;
         this.radius = radius;
      }

      @Override
      public String toString() {
         return "Circle with radius : " + radius;
      }


   }