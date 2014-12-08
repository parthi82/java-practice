 
  /** 
   * getInstance() methods return instance of a abract class's 
   * concrete subclass which can be assigned to abract class's 
   * referrence 
   */

   // abstract superclass 
   abstract class AbstractParent {

      // static factory method
      public static AbstractParent getInstance() {

          return new ConcreteChild();
      }
      
      // abstract method  
      public abstract void sayHello();

   }

   // concrete subclass
   class ConcreteChild extends AbstractParent {

      @Override 
      public void sayHello() {

         System.out.println( " Hello ");

      }
   
   }

   // Test driver class

   public class TestGetInstance {

       // main method 
       public static void main(String[] args) {

          AbstractParent parent = AbstractParent.getInstance();
          parent.sayHello();
          System.out.printf(" The variable 'parent' has referrence to instance of class : %s\n", parent.getClass().getName());

       }
   
   }