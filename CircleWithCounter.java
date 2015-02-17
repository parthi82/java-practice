
  /**
   * This program is used to demonstrate the use of
   * static variable in java. The static variable 
   * count is used to count the number of instances 
   * created.
   */

   public class CircleWithCounter {
     
      // static variable used to count the number of instances created
      static int count = 0;
      
      // Instance variable
      private double radius; 
      
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
