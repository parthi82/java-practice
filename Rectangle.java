 
   /**
    * Defined as subclass of Shape 
    */

   public class Rectangle extends Shape {
          
       // private member variable
       private int length;
       private int width;

       // constructor
       public Rectangle(String color, int length, int width) {
       	   super(color);  // call constructor of super class
       	   this.length = length;
       	   this.width = width;
       }  

       @Override
       public String toString() {
          return "Rectangle of length = " + length + "and width " + width + " and subclass of " + super.toString();
       }

       @Override
       public double getArea() {
       	  return length * width;
       }

       
   }