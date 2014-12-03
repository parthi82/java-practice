
  /**
   * This program is used to demonstarte polymorphism
   * Shape class is used as the super class for the
   * Rectangle and Triangle class 
   */

   public class Shape {
     
      private String color; // member variable

      // constructor 
      public Shape(String color) {
         this.color = color;
      }
       
      // methods 
      public String toString() {
         return "Shape of Color : \"" + color + "\"";
      }

      public double getArea() {
         System.err.println("Shape is not defined yet!");
         return 0;  // need to return to compile the program
      }

   }