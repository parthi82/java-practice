
  /**
   * Defined as subclass of Shape
   */

   public class Triangle extendes Shape {

   	  // private member variables 
   	  private int base;
   	  private int height;

   	  // constructor
   	  public Triangle(String color, int base, int height) {
   	  	super(color) // call constructor of superclass 
   	  	this.base =base;
   	  	this.height = height;
   	  }

   	  @Override
   	  public String toString() {
   	  	 return "Triangle of base = " + base + " and width " + width + " and subclass of " + super.toString(); // call toString method of superclass 
   	  }

   	  @Override 
   	  public double getArea() {
   	  	 return 0.5 * base * height;
   	  }


   }