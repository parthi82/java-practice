
 /**
  * Test driver class for CircleWithCounter class
  */

  public class TestCircleWithCounter {

     public static void main(String[] args) {

        CircleWithCounter c1 = new CircleWithCounter(1.1);
        System.out.println(c1);
        
        System.out.println(" Number of Circles created = " + CircleWithCounter.count);  // static variables are refered using class names
        
        CircleWithCounter c2 = new CircleWithCounter(2.3);
        System.out.println(c2);

        System.out.println(" Number of Circles created = " + CircleWithCounter.count); 

     }
  }
