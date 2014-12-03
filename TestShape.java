
   /**
    * The test driver program for shape and its subclasses.
    *  1. A subclass instance processes all the attributes operations of its superclass. When a superclass instance is expected, it can be
    *     substituted by a subclass instance. In other words, a reference to a class may hold an instance of that class or an instance of one of its
    *     subclasses - it is called substitutability.
    *  2. If a subclass instance is assign to a superclass reference, you can invoke the methods defined in the superclass only. You cannot invoke
    *     methods defined in the subclass.
    *  3. However, the substituted instance retains its own identity in terms of overridden methods and hiding variables. If the subclass
    *     overrides methods in the superclass, the subclass's version will be executed, instead of the superclass's version. 
    */

    public class TestShape {

       public static void main(String[] args) {

          // create reference of Shape class and assign it to instance of its subclass Rectangle
          Shape s1 = new Rectangle("RED", 4, 5); 
          // print using the toString() method in the subclass
          System.out.println(s1);
          // print values from overriden getArea() method in the subclass
          System.out.println(" The Area is " + s1.getArea());


          // create reference of Shape class and assign it to instance of its subclass
          Shape s2 = new Triangle("ORANGE", 6, 7);
          // print using the toString() method in the subclass
          System.out.println(s2); 
          // print values from overriden getArea() method in the subclass 
          System.out.println(" The Area is " + s2.getArea());  
       }

       // check if instance of sub class is also an instance of the super class
       Rectangle r1 = new Rectangle("red", 4, 6);
       System.out.println(r1 instanceof Rectangle); // true
       System.out.println(r1 instanceof Circle);   // true


    }