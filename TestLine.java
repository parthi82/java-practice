

  public class TestLine {

     public static void main(String[] args) {

         Line l1 = new Line(4, 5, 0, 3);
         System.out.println(l1); // toString();
         System.out.println(l1.getLength());

         Point p1 = new Point(5, 6);
         Point p2 = new Point(3, 4);
         Line l2 = new Line(p1, p2);
         System.out.println(l2);
         System.out.println(l2.getLength());

         l2.setBegin( new Point(0, 8) );
         l2.setEnd( new Point(5, 7) );
         System.out.println("l2 is : " + l2 + " and its length is " + l2.getLength());

     }

  }