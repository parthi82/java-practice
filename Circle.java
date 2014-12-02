 
  public class Circle {

  	  // public constants
  	  public static final double DEFAULT_RADIUS = 8.8;
  	  public static final String DEFAULT_COLOR = "RED";
      
      // private variable
      private double radius;
      private String color;
      
      // constructors
      public Circle() {            // default constructor
      	radius = DEFAULT_RADIUS;   
      	color = DEFAULT_COLOR;
      }
      
      public Circle(double radius) {
      	 this.radius = radius;
      	 color = DEFAULT_COLOR;
      }

      public Circle(double radius, String color) {
      	this.radius = radius;
      	this.color = color;
      }

      // getter and setter methods
      public double getRadius() {
      	return radius;
      }

      public void setRadius(double radius) {
      	this.radius =radius;

      }

      public String getColor() {
      	return color;
      }

      public void setColor(String color) {
      	this.color = color;
      }
      
      public String toString() {
      	return "The Radius is  " + radius + " and the color is " + color;
      }

      public double getArea() {  
      	return Math.PI * radius * radius;
      }


  }