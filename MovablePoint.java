
  /**
   * This class implements all abtract 
   * methods of Movable interface 
   */

   public class MovablePoint implements Movable {

       //private member variable
       private int x, y;

       //constructor
       public MovablePoint(int x, int y) {
           this.x = x;
           this.y =y;
       }

       @Override
       public String toString() {
          return "Point at ( " + x + " , " + y + " ) ";
       }

       @Override
       public void moveUp() {
          y--;
       }

       @Override
       public void moveDown() {
          y++;
       }

       @Override
       public void moveLeft() {
          x--;
       }

       @Override
       public void moveRight() {
          x++;
       }

   }