
  public class TestCylinder {

     public static void main(String[] args) {
             
        Cylinder cy1 = new Cylinder();
        
        System.out.println("The Cylinder has radius, height, color, volume and Area are : " + cy1.getRadius() + cy1.getHeight() + cy1.getColor() + cy1.getVolume() + cy1.getArea() );     

        Cylinder cy2 = new Cylinder(5.3, 10);
        
        System.out.println("The Cylinder has radius, height, color, volume and Area are : " + cy1.getRadius() + cy1.getHeight() + cy1.getColor() + cy1.getVolume() + cy2.getArea() );     



     }
  }