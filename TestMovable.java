
 /**
  * This is the test class for the MovablePoint
  * class and movable interface
  */

  public class TestMovable {

     public static void main(String[] args) {
        Movable m1 = new MovablePoint(5,6); //upcasting
        System.out.println(m1); // uses toString() method
        m1.moveUp();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);   
     }

  }